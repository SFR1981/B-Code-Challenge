import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;


public class GasGenerator extends Generator {

    private double emissionsRating;

    public GasGenerator(String name, Generation generation, double emissionsRating) {
        super(name, generation);
        this.emissionsRating = emissionsRating;
    }

    public GasGenerator(){}


    public double getEmissionsRating() {
        return emissionsRating;
    }

    @XmlElement(name="EmissionsRating")
    public void setEmissionsRating(double emissionsRating) {
        this.emissionsRating = emissionsRating;
    }
}
