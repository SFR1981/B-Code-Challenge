package Input;

import Input.GasGenerator;
import Input.Generation;

import javax.xml.bind.annotation.XmlElement;


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


    public double getTotalHeatInput() {
        return this.totalHeatInput;
    }

    @XmlElement(name="TotalHeatInput")
    public void setTotalHeatInput(double totalHeatInput) {
        this.totalHeatInput = totalHeatInput;
    }


    public double getActualNetGeneration() {
        return this.actualNetGeneration;
    }

    @XmlElement(name="ActualNetGeneration")
    public void setActualNetGeneration(double actualNetGeneration) {
        this.actualNetGeneration = actualNetGeneration;
    }

    public double getActualHeatRate(){
        return (this.totalHeatInput / this.actualNetGeneration);
    }
}

