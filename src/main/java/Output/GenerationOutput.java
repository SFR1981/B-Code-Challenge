package Output;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="GenerationOutput")
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

    @XmlElement(name="MaxEmissionGenerators")
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


    public void setActualHeatRates(ActualHeatRates actualHeatRates) {
        this.actualHeatRatesList = actualHeatRatesList;
    }


//        public ArrayList<OutputGenerator> getAllGenerators(){
//            ArrayList <OutputGenerator> all = new ArrayList<OutputGenerator>();
//            for (CoalGenerator coalGenerator : this.coalGenerators){
//                all.add(coalGenerator);
//            }
//            for (GasGenerator gasGenerator : this.gasGenerators){
//                all.add(gasGenerator);
//            }
//            for (WindGenerator  windGenerator: this.windGenerators){
//                all.add(windGenerator);
//            }
//            return all;
//        }


    }






