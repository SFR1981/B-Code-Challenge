package Output;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="GenerationOutput")
public class GenerationOutput {


    private Totals totals;
    private MaxEmissionGenerators maxEmissionGenerators;
    private ArrayList<ActualHeatRates> actualHeatRatesList;

    public GenerationOutput() {
    }

    public GenerationOutput(Totals totals,
                            MaxEmissionGenerators maxEmissionGenerators,
                            ArrayList<ActualHeatRates> actualHeatRatesList) {
        this.totals = totals;
        this.maxEmissionGenerators = maxEmissionGenerators;
        this.actualHeatRatesList = actualHeatRatesList;

    }

    @XmlElement(name="Totals")
    public Totals getTotals() {
        return totals;
    }

    public void setTotals(Totals totals) {
        this.totals = totals;
    }

    @XmlElement(name="MaxEmissionGenerators")
    public MaxEmissionGenerators getMaxEmissionGenerators() {
        return maxEmissionGenerators;
    }

    public void setMaxEmissionGenerators(MaxEmissionGenerators maxEmissionGenerators) {
        this.maxEmissionGenerators = maxEmissionGenerators;
    }


    @XmlElement(name="ActualHeatRates")
    public ArrayList<ActualHeatRates> getActualHeatRatesList() {
        return actualHeatRatesList;
    }


    public void setActualHeatRates(ActualHeatRates actualHeatRates) {
        this.actualHeatRatesList = actualHeatRatesList;
    }


//        public ArrayList<Generator> getAllGenerators(){
//            ArrayList <Generator> all = new ArrayList<Generator>();
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






