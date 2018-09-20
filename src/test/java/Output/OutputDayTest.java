package Output;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputDayTest {

    OutputDay outputDay = new OutputDay("name", "12/4/12", 0.1);

    @Test
    void getName() {
        assertEquals("name", outputDay.getName());
    }

    @Test
    void setName() {
        outputDay.setName("NewName");
        assertEquals("NewName", outputDay.getName());
    }

    @Test
    void getDate() {
        assertEquals("12/4/12", outputDay.getDate());
    }

    @Test
    void setDate() {
        outputDay.setDate("13/4/12");
        assertEquals("13/4/12", outputDay.getDate());
    }

    @Test
    void getEmission() {
        assertEquals(0.1, outputDay.getEmission());
    }

    @Test
    void setEmission() {
        outputDay.setEmission(0.2);
        assertEquals(0.2, outputDay.getEmission());

    }
}