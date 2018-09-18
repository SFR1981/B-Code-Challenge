
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;


public class CoalGenerator extends GasGenerator {

    private String name;
    private Generation generation;
    private double emissionsRating;
    private double totalHeatInput;
    private double actualNetGeneration;


    public CoalGenerator(String name, Generation generation,
                         double emissionsRating,
                         double totalHeatInput,
                         double actualNetGeneration) {
        super(name, generation, emissionsRating);
        this.totalHeatInput = totalHeatInput;
        this.actualNetGeneration = actualNetGeneration;
    }

    public CoalGenerator(){}

    @XmlElement(name="TotalHeatInput")
    public double getTotalHeatInput() {
        return totalHeatInput;
    }

    public void setTotalHeatInput(double totalHeatInput) {
        this.totalHeatInput = totalHeatInput;
    }

    @XmlElement(name="ActualNetGeneration")
    public double getActualNetGeneration() {
        return actualNetGeneration;
    }

    public void setActualNetGeneration(double actualNetGeneration) {
        this.actualNetGeneration = actualNetGeneration;
    }
}

