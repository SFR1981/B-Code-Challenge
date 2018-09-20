package Input;

import Input.Day;
import Input.Generation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GenerationTest {

    Day day = new Day("12", 3.4, 4.3);
    Day day2 = new Day("13",3.3,3.5);
    ArrayList<Day> days = new ArrayList<Day>(Arrays.asList(day, day2));
    ArrayList<Day> days2 = new ArrayList<Day>(Arrays.asList(day));
    Generation generation = new Generation(days);


    @Test
    void getdays() {
       assertEquals(2, generation.getDays().size());
    }

    @Test
    void setdays() {
        generation.setGeneration(days2);
        assertEquals(1, generation.getDays().size());
    }
}