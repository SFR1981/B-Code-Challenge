import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class Generation {


    private ArrayList<Day> days = new ArrayList<Day>();

    public Generation(){}

    public Generation(ArrayList<Day> days){
        this.days = days;
    }


    public ArrayList<Day> getDays() {
        return this.days;
    }


    @XmlElement(name="Generation")
    public void setGeneration(ArrayList<Day> days) {
        this.days = days;
    }
}
