package Input;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WindGeneratorTest {

    Day day = new Day("12", 3.4, 4.3);
    Day day2 = new Day("13",3.3,3.5);
    ArrayList<Day> days = new ArrayList<Day>(Arrays.asList(day, day2));
    ArrayList<Day> days2 = new ArrayList<Day>(Arrays.asList(day));
    Generation generation = new Generation(days);
    WindGenerator windGenerator = new WindGenerator("testName",generation,"testLocation");



    @Test
    void getLocation() {
        assertEquals("testLocation", windGenerator.getLocation());
    }

    @Test
    void setLocation() {
        windGenerator.setLocation("somewhere else");
        assertEquals("somewhere else", windGenerator.getLocation());
    }

    @Test
    void getName() {
        assertEquals("testName", windGenerator.getName());
    }

    @Test
    void setName() {
        windGenerator.setName("newName");
        assertEquals("newName", windGenerator.getName());
    }

    @Test
    void getGeneration() {
        assertEquals(generation, windGenerator.getGeneration());

    }

    @Test
    void setGeneration() {
        Generation nextGeneration = new Generation(days2);
        windGenerator.setGeneration(nextGeneration);
        assertEquals(nextGeneration, windGenerator.getGeneration());
    }
}