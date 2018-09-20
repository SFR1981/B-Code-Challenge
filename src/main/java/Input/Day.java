package Input;

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


    public String getDate() {
        return this.date;
    }

    @XmlElement(name="Date")
    public void setDate(String date) {
        this.date = date;
    }


    public double getEnergy() {
        return energy;
    }

    @XmlElement(name="Energy")
    public void setEnergy(double energy) {
        this.energy = energy;
    }


    public double getPrice() {
        return price;
    }

    @XmlElement(name="Price")
    public void setPrice(double price) {
        this.price = price;
    }
}
