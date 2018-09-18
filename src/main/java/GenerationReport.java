import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GenerationReport")
public class GenerationReport {




        private Wind wind;
        private Gas gas;
        private Coal coal;


        public GenerationReport(){

        }

        public GenerationReport(Wind wind, Gas gas, Coal coal){
            this.wind = wind;
            this.gas = gas;
            this.coal = coal;
        }

        @XmlElement(name="Wind")
        public Wind getWind() {
            if (this.wind == null) {
                this.wind =  new Wind();
            }
            return wind;
        }




        @XmlElement(name="Gas")
        public Gas getGas() {
            if (this.gas == null){
                this.gas = new Gas();
            }
            return gas;
        }



        @XmlElement(name="Coal")
        public Coal getCoal() {
            if (this.coal == null){
                this.coal = new Coal();
            }
            return coal;
        }


    }


