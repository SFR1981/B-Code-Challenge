import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.ArrayList;

public class Wind {

    private ArrayList<WindGenerator> windGenerators;

    public Wind(){}

    public Wind(ArrayList<WindGenerator> windGenerators){
        this.windGenerators = windGenerators;
    }


    @XmlElement
    public ArrayList<WindGenerator> getWindGenerators() {
        return windGenerators;
    }

    public void setWindGenerators(ArrayList<WindGenerator> windGenerators) {
        this.windGenerators = windGenerators;
    }
}
