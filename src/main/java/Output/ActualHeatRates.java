package Output;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"name", "heatRate"})
public class ActualHeatRates {

    private String name;
    private double heatRate;

    public ActualHeatRates(){

    }

    public ActualHeatRates(String name, double heatRate ){
        this.name = name;
        this.heatRate = heatRate;
    }

    @XmlElement(name="Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="HeatRate")
    public double getHeatRate() {
        return heatRate;
    }

    public void setHeatRate(double heatRate) {
        this.heatRate = heatRate;
    }
}
