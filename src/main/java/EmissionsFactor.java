import javax.xml.bind.annotation.XmlElement;

public class EmissionsFactor {


    private double high;
    private double medium;
    private double low;



    public EmissionsFactor(double high, double medium, double low) {
        this.high = high;
        this.medium = medium;
        this.low = low;
    }

    public EmissionsFactor(){}

    @XmlElement(name="High")
    public double getHigh() {
        return this.high;
    }

    @XmlElement(name="Medium")
    public double getMedium() {
        return this.medium;
    }

    @XmlElement(name="Low")
    public double getLow() {
        return this.low;
    }
}

