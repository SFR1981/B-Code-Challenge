package Reference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValueFactorTest {

    ValueFactor valueFactor = new ValueFactor(0.1,0.2,0.3);


    @Test
    void getHigh() {
        assertEquals(0.1, valueFactor.getHigh());
    }

    @Test
    void setHigh() {
        valueFactor.setHigh(0.3);
        assertEquals(0.3, valueFactor.getHigh());
    }

    @Test
    void getMedium() {
        assertEquals(0.2, valueFactor.getMedium());
    }

    @Test
    void setMedium() {
        valueFactor.setMedium(0.25);
        assertEquals(0.25, valueFactor.getMedium());
    }

    @Test
    void getLow() {
        assertEquals(0.3, valueFactor.getLow());
    }

    @Test
    void setLow() {
        valueFactor.setLow(0.35);
        assertEquals(0.35, valueFactor.getLow());
    }

}