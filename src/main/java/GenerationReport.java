import Input.Coal;
import Input.Gas;
import Input.Wind;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GenerationReport")
public class GenerationReport {

        private Wind wind;
        private Gas gas;
        private Coal coal;

        public GenerationReport(){
        }

        public GenerationReport(Wind wind,
                                Gas gas,
                                Coal coal){
            this.wind = wind;
            this.gas = gas;
            this.coal = coal;

        }



        public Wind getWind() {
            return wind;
        }


        @XmlElement(name="Wind")
        public void setWind(Wind wind){
            this.wind = wind;
        }

        public Gas getGas() {
            return this.gas;
        }

        @XmlElement(name="Gas")
        public void setGas(Gas gas){
            this.gas = gas;
        }


        public Coal getCoal() {
            return this.coal;
        }

        @XmlElement(name="Coal")
        public void setCoal(Coal coal){
            this.coal = coal;
        }

    }


