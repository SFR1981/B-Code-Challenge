package Input;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GasTest {
    Day day = new Day("12", 3.4, 4.3);
    Day day2 = new Day("13",3.3,3.5);
    ArrayList<Day> days = new ArrayList<Day>(Arrays.asList(day, day2));
    ArrayList<Day> days2 = new ArrayList<Day>(Arrays.asList(day));
    Generation generation = new Generation(days);
    GasGenerator gasGenerator = new GasGenerator("testName", generation, 0.1);
    GasGenerator newGasGenerator = new GasGenerator("differentName", generation, 0.1);
    ArrayList<GasGenerator> gasGeneratorsList = new ArrayList<GasGenerator>(
            Arrays.asList(gasGenerator));
    ArrayList<GasGenerator> newGasGeneratorsList = new ArrayList<GasGenerator>(
            Arrays.asList(newGasGenerator));

    Gas gas = new Gas(gasGeneratorsList);


    @Test
    void getGasGenerators() {
        assertEquals(gasGeneratorsList, gas.getGasGenerators());
    }

    @Test
    void setGasGenerators() {
        gas.setGasGenerators(newGasGeneratorsList);
        assertEquals(newGasGeneratorsList, gas.getGasGenerators());
    }
}