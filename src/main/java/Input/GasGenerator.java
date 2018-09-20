package Input;

import Input.Generation;
import Input.Generator;

import javax.xml.bind.annotation.XmlElement;


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
