import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {

    Day day = new Day("12", 3.4, 4.3);



    @Test
    void getDate() {
        assertEquals("12", day.getDate());
    }

    @Test
    void getEnergy() {
        assertEquals(3.4, day.getEnergy());
    }

    @Test
    void getPrice() {
        assertEquals(4.3, day.getPrice());
    }
}