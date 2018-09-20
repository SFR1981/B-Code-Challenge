package Input;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CoalGeneratorTest {

    Day day = new Day("12", 3.4, 4.3);
    Day day2 = new Day("13",3.3,3.5);
    ArrayList<Day> days = new ArrayList<Day>(Arrays.asList(day, day2));
    ArrayList<Day> days2 = new ArrayList<Day>(Arrays.asList(day));
    Generation generation = new Generation(days);
    CoalGenerator coalGenerator = new CoalGenerator("testName", generation, 0.1, 0.2, 0.2);



    @Test
    void getTotalHeatInput() {
        assertEquals(0.2, coalGenerator.getTotalHeatInput());
    }

    @Test
    void setTotalHeatInput() {
        coalGenerator.setTotalHeatInput(0.25);
        assertEquals(0.25, coalGenerator.getTotalHeatInput());

    }

    @Test
    void getActualNetGeneration() {
        assertEquals(0.2, coalGenerator.getActualNetGeneration());
    }

    @Test
    void setActualNetGeneration() {
        coalGenerator.setActualNetGeneration(0.35);
        assertEquals(0.35, coalGenerator.getActualNetGeneration());
    }

    @Test
    void getActualHeatRate() {
        assertEquals(1.0, coalGenerator.getActualHeatRate());
    }

    @Test
    void getEmissionsRating() {
        assertEquals(0.1, coalGenerator.getEmissionsRating());
    }

    @Test
    void setEmissionsRating() {
        coalGenerator.setEmissionsRating(0.0);
        assertEquals(0.0, coalGenerator.getEmissionsRating());

    }

    @Test
    void getName() {
        assertEquals("testName", coalGenerator.getName());
    }

    @Test
    void setName() {
        coalGenerator.setName("newName");
        assertEquals("newName", coalGenerator.getName());

    }

    @Test
    void getGeneration() {
        assertEquals(generation, coalGenerator.getGeneration());
    }

    @Test
    void setGeneration() {
        Generation nextGeneration = new Generation(days2);
        coalGenerator.setGeneration(nextGeneration);
        assertEquals(nextGeneration, coalGenerator.getGeneration());
    }
}