package Output;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="GenerationOutput")
public class GenerationOutput {


    private ArrayList<Generator> totals;
    private ArrayList<Day> maxEmissionGenerators;
    private ArrayList<ActualHeatRates> actualHeatRatesList;

    public GenerationOutput() {
    }

    public GenerationOutput(ArrayList<Generator> totals,
                            ArrayList<Day> maxEmissionGenerators,
                            ArrayList<ActualHeatRates> actualHeatRatesList) {
        this.totals = totals;
        this.maxEmissionGenerators = maxEmissionGenerators;
        this.actualHeatRatesList = actualHeatRatesList;

    }

    @XmlElement(name="Totals")
    public ArrayList<Generator> getTotals() {
        return totals;
    }

    public void setTotals(ArrayList<Generator> totals) {
        this.totals = totals;
    }

    @XmlElement(name="MaxEmissionGenerators")
    public ArrayList<Day> getMaxEmissionGenerators() {
        return maxEmissionGenerators;
    }

    public void setMaxEmissionGenerators(ArrayList<Day> maxEmissionGenerators) {
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






