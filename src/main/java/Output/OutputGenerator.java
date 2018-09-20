package Output;

import javax.xml.bind.annotation.XmlElement;

public class OutputGenerator {

    private String name;
    private double total;


    public OutputGenerator(){}

    public OutputGenerator(String name, double total){
        this.name = name;
        this.total = total;
    }

    @XmlElement(name="Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="Total")
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
