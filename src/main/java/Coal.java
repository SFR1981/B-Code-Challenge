import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class Coal {

    private ArrayList<CoalGenerator> coalGenerators;

    public Coal(){}

    public Coal(ArrayList<CoalGenerator> coalGenerators){
        this.coalGenerators = coalGenerators;
    }

    @XmlElement(name="CoalGenerator")
    public ArrayList<CoalGenerator> getCoalGenerators() {
        return this.coalGenerators;
    }

    public void setCoalGenerators(ArrayList<CoalGenerator> coalGenerators) {
        this.coalGenerators = coalGenerators;
    }
}
