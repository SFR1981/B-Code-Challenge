import Input.CoalGenerator;
import Input.Day;
import Input.GasGenerator;
import Input.WindGenerator;
import Output.ActualHeatRates;
import Output.GenerationOutput;
import Output.OutputDay;
import Output.OutputGenerator;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.time.Instant;
import java.util.*;

public class CreateOutput {



    public static void createObjects(GenerationReport generationReport) {

        ArrayList<OutputGenerator> totals = getTotals(generationReport);
        ArrayList<OutputDay> maxEmissionGenerators = getMaxEmissionGenerators(generationReport);
        ArrayList<ActualHeatRates> actualHeatRates = getActualHeatRatesList(generationReport);
        GenerationOutput generationOutput = new GenerationOutput(totals,maxEmissionGenerators,actualHeatRates);


        String path = "output/GenerartionOutput"+ Date.from(Instant.now())+".xml";

        File file = new File( path );


        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(GenerationOutput.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(generationOutput, file);
            jaxbMarshaller.marshal(generationOutput, System.out);

            System.out.println(file.exists());
            System.out.println(file.getName());

        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }


    public static ArrayList<OutputGenerator> getTotals(GenerationReport generationReport){
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
        return outputGenerators;

    }

    public static ArrayList<OutputDay> getMaxEmissionGenerators(GenerationReport generationReport){
        ArrayList<OutputDay> maxEmissionGenerators = new ArrayList<OutputDay>();
        ArrayList<OutputDay> gasAndCoal = new ArrayList<OutputDay>();
        Calculator calculator = new Calculator();

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

        ArrayList<OutputDay> removeList = new ArrayList<OutputDay>();
        while (gasAndCoal.size() > 0){
            Collections.sort(gasAndCoal, new SortByEmission());
            OutputDay max = gasAndCoal.remove(gasAndCoal.size()-1);
            maxEmissionGenerators.add(max);
            for (OutputDay outputDay: gasAndCoal) {
                if (outputDay.getDate().contains(max.getDate())){
                    removeList.add(outputDay);
                }
            }
            gasAndCoal.removeAll(removeList);
        }
        return maxEmissionGenerators;

    }

    public static ArrayList<ActualHeatRates> getActualHeatRatesList(GenerationReport generationReport) {
        ArrayList<ActualHeatRates> actualHeatRatesList = new ArrayList<ActualHeatRates>();
        for (CoalGenerator coalGenerator : generationReport.getCoal().getCoalGenerators()) {
            String name = coalGenerator.getName();
            double heatRate = coalGenerator.getActualHeatRate();
            ActualHeatRates actualHeatRates = new ActualHeatRates(name, heatRate);
            actualHeatRatesList.add(actualHeatRates);
        }
        return actualHeatRatesList;
    }

}
