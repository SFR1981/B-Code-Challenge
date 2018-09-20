package Input;

import Input.WindGenerator;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class Wind {

    private ArrayList<WindGenerator> windGenerators = new ArrayList<WindGenerator>();


    public Wind(ArrayList<WindGenerator> windGenerators){
        this.windGenerators = windGenerators;
    }


    public Wind(){

    }



    public ArrayList<WindGenerator> getWindGenerators() {
        return windGenerators;
    }


    @XmlElement(name="WindGenerator")
    public void setWindGenerators(ArrayList<WindGenerator> windGenerators) {
        this.windGenerators = windGenerators;
    }
}
