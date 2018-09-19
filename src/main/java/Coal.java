import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class Coal {

    private ArrayList<CoalGenerator> coalGenerators = new ArrayList<CoalGenerator>();;

    public Coal(){}

    public Coal(ArrayList<CoalGenerator> coalGenerators){
        this.coalGenerators = coalGenerators;
    }


    public ArrayList<CoalGenerator> getCoalGenerators() {
        return this.coalGenerators;
    }

    @XmlElement(name="CoalGenerator")
    public void setCoalGenerators(ArrayList<CoalGenerator> coalGenerators) {
        this.coalGenerators = coalGenerators;
    }
}
