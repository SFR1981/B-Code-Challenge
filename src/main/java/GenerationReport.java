import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="GenerationReport")
public class GenerationReport {


        private Wind wind;
        private ArrayList<GasGenerator> gasGenerators;
        private ArrayList<CoalGenerator> coalGenerators;


        public GenerationReport(){
        }

        public GenerationReport(Wind wind,
                                ArrayList<GasGenerator> gasGenerators,
                                ArrayList<CoalGenerator> coalGenerators){
            this.wind = wind;
            this.gasGenerators = gasGenerators;
            this.coalGenerators = coalGenerators;

        }



        @XmlElement(name="Wind")
        public Wind getWind() {
            return wind;
        }


//        @XmlElementWrapper(name="Gas")
//        @XmlElement(name="GasGenerator")
//        public ArrayList<GasGenerator> getGasGenerators() {
//            return this.gasGenerators;
//        }


//        @XmlElementWrapper(name="Coal")
//        @XmlElement(name="CoalGenerator")
//        public ArrayList<CoalGenerator> getCoalGenerators() {
//            return this.coalGenerators;
//        }
//
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


