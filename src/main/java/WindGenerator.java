import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import java.util.ArrayList;



public class WindGenerator extends Generator {

    private String location;


    public WindGenerator(String name, Generation generation, String location) {
        super(name, generation);
        this.location = location;
    }

    public WindGenerator(){}

    @XmlElement(name="Location")
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
