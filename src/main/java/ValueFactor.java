import javax.xml.bind.annotation.XmlElement;

public class ValueFactor {


    private double high;
    private double medium;
    private double low;



    public ValueFactor(double high, double medium, double low) {
        this.high = high;
        this.medium = medium;
        this.low = low;
    }

    public ValueFactor(){}


    public double getHigh() {
        return high;
    }

    @XmlElement(name="High")
    public void setHigh(double high) {
        this.high = high;
    }

    public double getMedium() {
        return medium;
    }

    @XmlElement(name="Medium")
    public void setMedium(double medium) {
        this.medium = medium;
    }

    public double getLow() {
        return low;
    }

    @XmlElement(name="Low")
    public void setLow(double low) {
        this.low = low;
    }
}

