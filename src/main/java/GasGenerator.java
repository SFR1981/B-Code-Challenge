import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;


public class GasGenerator extends Generator {

    private double emissionsRating;

    public GasGenerator(String name, Generation generation, double emissionsRating) {
        super(name, generation);
        this.emissionsRating = emissionsRating;
    }

    public GasGenerator(){}

    @XmlElement(name="EmissionsRating")
    public double getEmissionsRating() {
        return emissionsRating;
    }

    public void setEmissionsRating(double emissionsRating) {
        this.emissionsRating = emissionsRating;
    }
}
