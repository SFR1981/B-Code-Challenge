package Output;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;


@XmlRootElement(name="GenerationOutput")
@XmlType(propOrder = {"totals", "maxEmissionGenerators", "actualHeatRatesList"})
public class GenerationOutput {


    private ArrayList<OutputGenerator> totals;
    private ArrayList<OutputDay> maxEmissionGenerators;
    private ArrayList<ActualHeatRates> actualHeatRatesList;

    public GenerationOutput() {
    }

    public GenerationOutput(ArrayList<OutputGenerator> totals,
                            ArrayList<OutputDay> maxEmissionGenerators,
                            ArrayList<ActualHeatRates> actualHeatRatesList) {
        this.totals = totals;
        this.maxEmissionGenerators = maxEmissionGenerators;
        this.actualHeatRatesList = actualHeatRatesList;

    }

    @XmlElementWrapper(name="Totals")
    @XmlElement(name="Generator")
    public ArrayList<OutputGenerator> getTotals() {
        return totals;
    }

    public void setTotals(ArrayList<OutputGenerator> totals) {
        this.totals = totals;
    }

    @XmlElementWrapper(name="MaxEmissionGenerators")
    @XmlElement(name="Day")
    public ArrayList<OutputDay> getMaxEmissionGenerators() {
        return maxEmissionGenerators;
    }

    public void setMaxEmissionGenerators(ArrayList<OutputDay> maxEmissionGenerators) {
        this.maxEmissionGenerators = maxEmissionGenerators;
    }


    @XmlElement(name="ActualHeatRates")
    public ArrayList<ActualHeatRates> getActualHeatRatesList() {
        return actualHeatRatesList;
    }


    public void setActualHeatRates(ArrayList<ActualHeatRates> newActualHeatRatesList) {
        this.actualHeatRatesList = newActualHeatRatesList;
    }



    }






