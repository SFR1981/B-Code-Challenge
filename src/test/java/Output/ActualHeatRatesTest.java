package Output;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActualHeatRatesTest {

    ActualHeatRates actualHeatRates = new ActualHeatRates("name", 0.1);


    @Test
    void getName() {
        assertEquals("name", actualHeatRates.getName());
    }

    @Test
    void setName() {
        actualHeatRates.setName("newName");
        assertEquals("newName", actualHeatRates.getName());
    }

    @Test
    void getHeatRate() {
        assertEquals(0.1, actualHeatRates.getHeatRate());
    }

    @Test
    void setHeatRate() {
        actualHeatRates.setHeatRate(0.2);
        assertEquals(0.2, actualHeatRates.getHeatRate());
    }
}