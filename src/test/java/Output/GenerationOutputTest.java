package Output;

import Input.GasGenerator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GenerationOutputTest {

    OutputGenerator outputGenerator = new OutputGenerator("name", 0.1);
    OutputGenerator newOutputGenerator = new OutputGenerator("newName", 0.2);
    OutputDay outputDay = new OutputDay("name", "12/4/12", 0.1);
    OutputDay newOutputDay = new OutputDay("newName", "13/4/12", 0.2);
    ActualHeatRates actualHeatRates = new ActualHeatRates("name", 0.1);
    ActualHeatRates newActualHeatRates = new ActualHeatRates("newName", 0.4);

    ArrayList<OutputGenerator> totals =  new ArrayList<OutputGenerator>(Arrays.asList(outputGenerator));
    ArrayList<OutputGenerator> newTotals =  new ArrayList<OutputGenerator>(Arrays.asList(newOutputGenerator));
    ArrayList<OutputDay> maxEmissionGenerators = new ArrayList<OutputDay>(Arrays.asList(outputDay));
    ArrayList<OutputDay> newMaxEmissionGenerators = new ArrayList<OutputDay>(Arrays.asList(newOutputDay));
    ArrayList<ActualHeatRates> actualHeatRatesList = new ArrayList<ActualHeatRates>(Arrays.asList(actualHeatRates));
    ArrayList<ActualHeatRates> newActualHeatRatesList = new ArrayList<ActualHeatRates>(Arrays.asList(newActualHeatRates));

    GenerationOutput generationOutput = new GenerationOutput(totals,maxEmissionGenerators,actualHeatRatesList);

    @Test
    void getTotals() {
        assertEquals(totals, generationOutput.getTotals());
    }

    @Test
    void setTotals() {
        generationOutput.setTotals(newTotals);
        assertEquals(newTotals, generationOutput.getTotals());
    }

    @Test
    void getMaxEmissionGenerators() {
        assertEquals(maxEmissionGenerators, generationOutput.getMaxEmissionGenerators());
    }

    @Test
    void setMaxEmissionGenerators() {
        generationOutput.setMaxEmissionGenerators(newMaxEmissionGenerators);
        assertEquals(newMaxEmissionGenerators, generationOutput.getMaxEmissionGenerators());
    }

    @Test
    void getActualHeatRatesList() {
        assertEquals(actualHeatRatesList, generationOutput.getActualHeatRatesList());
    }

    @Test
    void setActualHeatRates() {
        generationOutput.setActualHeatRates(newActualHeatRatesList);
        assertEquals(newActualHeatRatesList, generationOutput.getActualHeatRatesList());

    }
}