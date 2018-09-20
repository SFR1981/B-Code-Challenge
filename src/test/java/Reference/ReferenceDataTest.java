package Reference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReferenceDataTest {

    ValueFactor valueFactor = new ValueFactor(0.1,0.2,0.3);
    ValueFactor newValueFactor = new ValueFactor(0.1,0.2,0.3);
    EmissionsFactor emissionsFactor = new EmissionsFactor(0.1,0.2,0.3);
    EmissionsFactor newEmissionsFactor = new EmissionsFactor(0.1,0.2,0.3);
    Factors factors = new Factors(valueFactor, emissionsFactor);
    Factors newFactors = new Factors(newValueFactor, newEmissionsFactor);
    ReferenceData referenceData = new ReferenceData(factors);

    @Test
    void getFactors() {
        assertEquals(factors, referenceData.getFactors());
    }

    @Test
    void setFactors() {
        referenceData.setFactors(newFactors);
        assertEquals(newFactors , referenceData.getFactors());
    }
}