package Input;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WindTest {
    
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

    Wind wind = new Wind(windGeneratorsList);

    @Test
    void getWindGenerators() {
        assertEquals(windGeneratorsList, wind.getWindGenerators());
    }

    @Test
    void setWindGenerators() {
        wind.setWindGenerators(newWindGeneratorsList);
        assertEquals(newWindGeneratorsList, wind.getWindGenerators());
    }
}