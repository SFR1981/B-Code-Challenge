import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class Gas {

    private ArrayList<GasGenerator> gasGenerators;

    public Gas(){}

    public Gas(ArrayList<GasGenerator> gasGenerators){
        this.gasGenerators = gasGenerators;
    }

    @XmlElement(name="GasGenerator")
    public ArrayList<GasGenerator> getGasGenerators() {
        return gasGenerators;
    }

    public void setGasGenerators(ArrayList<GasGenerator> gasGenerators) {
        this.gasGenerators = gasGenerators;
    }
}
