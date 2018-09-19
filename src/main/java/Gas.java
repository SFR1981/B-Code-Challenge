import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public class Gas {

    private ArrayList<GasGenerator> gasGenerators = new ArrayList<GasGenerator>();;

    public Gas(){}

    public Gas(ArrayList<GasGenerator> gasGenerators){
        this.gasGenerators = gasGenerators;
    }


    public ArrayList<GasGenerator> getGasGenerators() {
        return gasGenerators;
    }

    @XmlElement(name="GasGenerator")
    public void setGasGenerators(ArrayList<GasGenerator> gasGenerators) {
        this.gasGenerators = gasGenerators;
    }
}
