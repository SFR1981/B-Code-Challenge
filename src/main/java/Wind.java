import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class Wind {

    private ArrayList<WindGenerator> windGenerators;

    public Wind(){}

    public Wind(ArrayList<WindGenerator> windGenerators){
        this.windGenerators = windGenerators;
    }

    @XmlElement(name="WindGenerator")
    public ArrayList<WindGenerator> getWindGenerators() {
        if (this.windGenerators == null) {
            this.windGenerators =  new ArrayList<WindGenerator>();
        }
        return this.windGenerators;
    }

    public void setWindGenerators(ArrayList<WindGenerator> windGenerators) {
        this.windGenerators = windGenerators;
    }
}
