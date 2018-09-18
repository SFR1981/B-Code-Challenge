import javax.xml.bind.annotation.XmlElement;
import java.util.Date;

public class Day {

    private String date;// does it need to be a date?
    private double energy;
    private double price;

    public Day(){

    }

    public Day(String date, double energy, double price){
        this.date = date;
        this.energy = energy;
        this.price = price;
    }

    @XmlElement(name="Date")
    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @XmlElement(name="Energy")
    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    @XmlElement(name="Price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
