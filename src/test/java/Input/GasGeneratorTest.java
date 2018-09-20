package Input;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GasGeneratorTest {

    Day day = new Day("12", 3.4, 4.3);
    Day day2 = new Day("13",3.3,3.5);
    ArrayList<Day> days = new ArrayList<Day>(Arrays.asList(day, day2));
    ArrayList<Day> days2 = new ArrayList<Day>(Arrays.asList(day));
    Generation generation = new Generation(days);
    GasGenerator gasGenerator = new GasGenerator("testName", generation, 0.1);



    @Test
    void getEmissionsRating() {
        assertEquals(0.1, gasGenerator.getEmissionsRating());
    }

    @Test
    void setEmissionsRating() {
        gasGenerator.setEmissionsRating(0.2);
        assertEquals(0.2, gasGenerator.getEmissionsRating());
    }

    @Test
    void getName() {
        assertEquals("testName", gasGenerator.getName());
    }

    @Test
    void setName() {
        gasGenerator.setName("newName");
        assertEquals("newName", gasGenerator.getName());
    }

    @Test
    void getGeneration() {
        assertEquals(generation, gasGenerator.getGeneration());
    }

    @Test
    void setGeneration() {
        Generation nextGeneration = new Generation(days2);
        gasGenerator.setGeneration(nextGeneration);
        assertEquals(nextGeneration, gasGenerator.getGeneration());
    }
}