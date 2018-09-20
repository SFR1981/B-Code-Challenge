package Output;

import javax.xml.bind.annotation.XmlElement;

public class OutputDay {

    private String name;
    private String date;
    private double emission;

    public OutputDay(){

    }
    public OutputDay(String name, String date, double emission){
        this.name = name;
        this.date = date;
        this.emission = emission;
    }


    @XmlElement(name="Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="Date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @XmlElement(name="Emission")
    public double getEmission() {
        return emission;
    }

    public void setEmission(double emission) {
        this.emission = emission;
    }
}
