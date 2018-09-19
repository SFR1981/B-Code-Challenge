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


    public double getHigh() {
        return this.high;
    }

    @XmlElement(name="High")
    public void setHigh(double high){
        this.high = high;

    }

    @XmlElement(name="Medium")
    public double getMedium() {
        return this.medium;
    }

    public void setMedium(double medium){
        this.medium = medium;
    }

    @XmlElement(name="Low")
    public double getLow() {
        return this.low;
    }

    public void setLow(double low){
        this.low = low;
    }
}

