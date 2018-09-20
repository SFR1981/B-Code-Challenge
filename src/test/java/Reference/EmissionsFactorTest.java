package Reference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmissionsFactorTest {

    EmissionsFactor emissionsFactor = new EmissionsFactor(0.1,0.2,0.3);


    @Test
    void getHigh() {
        assertEquals(0.1, emissionsFactor.getHigh());
    }

    @Test
    void setHigh() {
        emissionsFactor.setHigh(0.3);
        assertEquals(0.3, emissionsFactor.getHigh());
    }

    @Test
    void getMedium() {
        assertEquals(0.2, emissionsFactor.getMedium());
    }

    @Test
    void setMedium() {
        emissionsFactor.setMedium(0.25);
        assertEquals(0.25, emissionsFactor.getMedium());
    }

    @Test
    void getLow() {
        assertEquals(0.3, emissionsFactor.getLow());
    }

    @Test
    void setLow() {
        emissionsFactor.setLow(0.35);
        assertEquals(0.35, emissionsFactor.getLow());
    }

}