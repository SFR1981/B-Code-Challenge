package Reference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorsTest {

    ValueFactor valueFactor = new ValueFactor(0.1,0.2,0.3);
    ValueFactor newValueFactor = new ValueFactor(0.1,0.2,0.3);
    EmissionsFactor emissionsFactor = new EmissionsFactor(0.1,0.2,0.3);
    EmissionsFactor newEmissionsFactor = new EmissionsFactor(0.1,0.2,0.3);
    Factors factors = new Factors(valueFactor, emissionsFactor);

    @Test
    void getValueFactor() {
        assertEquals(valueFactor, factors.getValueFactor());
    }

    @Test
    void setValueFactor() {
        factors.setValueFactor(newValueFactor);
        assertEquals(newValueFactor, factors.getValueFactor());
    }

    @Test
    void getEmissionsFactor() {
        assertEquals(emissionsFactor, factors.getEmissionsFactor());
    }

    @Test
    void setEmissionsFactor() {
        factors.setEmissionsFactor(newEmissionsFactor);
        assertEquals(newEmissionsFactor, factors.getEmissionsFactor());
    }
}