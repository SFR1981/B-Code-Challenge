import Input.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GenerationReportTest {

    Day day = new Day("12", 3.4, 4.3);
    Day day2 = new Day("13",3.3,3.5);
    ArrayList<Day> days = new ArrayList<Day>(Arrays.asList(day, day2));
    ArrayList<Day> days2 = new ArrayList<Day>(Arrays.asList(day));
    Generation generation = new Generation(days);
    WindGenerator windGenerator = new WindGenerator("testName", generation, "testLocation");
    WindGenerator newWindGenerator = new WindGenerator("differentName", generation, "newLocation");
    ArrayList<WindGenerator> windGeneratorsList = new ArrayList<WindGenerator>(
            Arrays.asList(windGenerator));
    ArrayList<WindGenerator> newWindGeneratorsList = new ArrayList<WindGenerator>(
            Arrays.asList(newWindGenerator));

    GasGenerator gasGenerator = new GasGenerator("testName", generation, 0.1);
    GasGenerator newGasGenerator = new GasGenerator("differentName", generation, 0.1);
    ArrayList<GasGenerator> gasGeneratorsList = new ArrayList<GasGenerator>(
            Arrays.asList(gasGenerator));
    ArrayList<GasGenerator> newGasGeneratorsList = new ArrayList<GasGenerator>(
            Arrays.asList(newGasGenerator));

    CoalGenerator coalGenerator = new CoalGenerator("testName", generation, 0.1, 0.2, 0.2);
    CoalGenerator newCoalGenerator = new CoalGenerator("differentName", generation, 0.1, 0.2, 0.2);
    ArrayList<CoalGenerator> coalGeneratorsList = new ArrayList<CoalGenerator>(
            Arrays.asList(coalGenerator));
    ArrayList<CoalGenerator> newCoalGeneratorsList = new ArrayList<CoalGenerator>(
            Arrays.asList(newCoalGenerator));

    Coal coal = new Coal(coalGeneratorsList);
    Coal newCoal = new Coal(newCoalGeneratorsList);
    Gas gas = new Gas(gasGeneratorsList);
    Gas newGas = new Gas(newGasGeneratorsList);
    Wind wind = new Wind(windGeneratorsList);
    Wind newWind = new Wind (newWindGeneratorsList);

    GenerationReport generationReport = new GenerationReport(wind, gas, coal);

    @Test
    void getWind() {
        assertEquals(wind, generationReport.getWind());
    }

    @Test
    void setWind() {
        generationReport.setWind(newWind);
        assertEquals(newWind, generationReport.getWind());
    }

    @Test
    void getGas() {
        assertEquals(gas, generationReport.getGas());
    }

    @Test
    void setGas() {
        generationReport.setGas(newGas);
        assertEquals(newGas, generationReport.getGas());
    }


    @Test
    void getCoal() {
        assertEquals(coal, generationReport.getCoal());
    }

    @Test
    void setCoal() {
        generationReport.setCoal(newCoal);
        assertEquals(newCoal, generationReport.getCoal());
    }
}