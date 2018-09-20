import Output.OutputDay;
import Output.OutputGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CreateOutput {

    public static void createObjects(GenerationReport generationReport) {


        System.out.println(generationReport);
        Calculator calculator = new Calculator();
        ArrayList<OutputGenerator> outputGenerators = new ArrayList<OutputGenerator>();

        for (WindGenerator windGenerator : generationReport.getWind().getWindGenerators()) {
            String name = windGenerator.getName();
            ArrayList<Day> days = windGenerator.getGeneration().getDays();
            double total = 0;
            for (Day day : days) {
                total += (day.getEnergy() * day.getPrice()) * calculator.getValueFactorForGenerator(windGenerator);

            }
            System.out.println(total);
            OutputGenerator outputGenerator = new OutputGenerator(name, total);
            outputGenerators.add(outputGenerator);
        }

        for (GasGenerator gasGenerator : generationReport.getGas().getGasGenerators()) {
            String name = gasGenerator.getName();
            ArrayList<Day> days = gasGenerator.getGeneration().getDays();
            double total = 0;
            for (Day day : days) {
                total += (day.getEnergy() * day.getPrice()) * calculator.getValueFactorForGenerator(gasGenerator);

            }
            System.out.println(total);
            OutputGenerator outputGenerator = new OutputGenerator(name, total);
            outputGenerators.add(outputGenerator);
        }
        for (CoalGenerator coalGenerator : generationReport.getCoal().getCoalGenerators()) {
            String name = coalGenerator.getName();
            ArrayList<Day> days = coalGenerator.getGeneration().getDays();
            double total = 0;
            for (Day day : days) {
                total += (day.getEnergy() * day.getPrice()) * calculator.getValueFactorForGenerator(coalGenerator);

            }
            System.out.println(total);
            OutputGenerator outputGenerator = new OutputGenerator(name, total);
            outputGenerators.add(outputGenerator);
        }
        System.out.println(outputGenerators);

        ArrayList<OutputDay> maxEmissionGenerators = new ArrayList<OutputDay>();
        ArrayList<OutputDay> gasAndCoal = new ArrayList<OutputDay>();

        for (GasGenerator gasGenerator : generationReport.getGas().getGasGenerators()) {
            String name = gasGenerator.getName();
            double emissionRating = gasGenerator.getEmissionsRating();
            double emissionFactor = calculator.getEmissionsFactorForGenerator(gasGenerator);
            for (Day day : gasGenerator.getGeneration().getDays()) {
                String date = day.getDate();
                double emission = (day.getEnergy() * emissionRating) * emissionFactor;
                OutputDay outputDay = new OutputDay(name, date, emission);
                gasAndCoal.add(outputDay);
            }
        }

        for (CoalGenerator coalGenerator : generationReport.getCoal().getCoalGenerators()) {
            String name = coalGenerator.getName();
            double emissionRating = coalGenerator.getEmissionsRating();
            double emissionFactor = calculator.getEmissionsFactorForGenerator(coalGenerator);
            for (Day day : coalGenerator.getGeneration().getDays()) {
                String date = day.getDate();
                double emission = (day.getEnergy() * emissionRating) * emissionFactor;
                OutputDay outputDay = new OutputDay(name, date, emission);
                gasAndCoal.add(outputDay);
            }
        }
        System.out.println(gasAndCoal);
        class SortByEmission implements Comparator<OutputDay> {
            public int compare(OutputDay a, OutputDay b) {
                if ( a.getEmission() < b.getEmission() ) return -1;
                else if ( a.getEmission() == b.getEmission() ) return 0;
                else return 1;
            }
        }

        while (gasAndCoal.size() > 0){
            Collections.sort(gasAndCoal, new SortByEmission());
            OutputDay max = gasAndCoal.remove(gasAndCoal.size()-1);
            maxEmissionGenerators.add(max);
            for (OutputDay outputDay: gasAndCoal) {
                if (outputDay.getDate().contains(max.getDate())){
                    System.out.println(outputDay.getDate());
                    System.out.println(max.getDate());
                    gasAndCoal.remove(outputDay);
                }

            }

        }








            System.out.println(maxEmissionGenerators);


        }



}
