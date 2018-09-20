package Input;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CoalTest {
    Day day = new Day("12", 3.4, 4.3);
    Day day2 = new Day("13",3.3,3.5);
    ArrayList<Day> days = new ArrayList<Day>(Arrays.asList(day, day2));
    ArrayList<Day> days2 = new ArrayList<Day>(Arrays.asList(day));
    Generation generation = new Generation(days);
    CoalGenerator coalGenerator = new CoalGenerator("testName", generation, 0.1, 0.2, 0.2);
    CoalGenerator newCoalGenerator = new CoalGenerator("differentName", generation, 0.1, 0.2, 0.2);
    ArrayList<CoalGenerator> coalGeneratorsList = new ArrayList<CoalGenerator>(
            Arrays.asList(coalGenerator));
    ArrayList<CoalGenerator> newCoalGeneratorsList = new ArrayList<CoalGenerator>(
            Arrays.asList(newCoalGenerator));

    Coal coal = new Coal(coalGeneratorsList);


    @Test
    void getCoalGenerators() {
        assertEquals(coalGeneratorsList, coal.getCoalGenerators());
    }

    @Test
    void setCoalGenerators() {
        coal.setCoalGenerators(newCoalGeneratorsList);
        assertEquals(newCoalGeneratorsList, coal.getCoalGenerators());
    }
}