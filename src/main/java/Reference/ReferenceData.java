package Reference;

import org.omg.CORBA.portable.ValueFactory;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name="ReferenceData")
public class ReferenceData {


    private Factors factors;


    public ReferenceData(){

    }

    public ReferenceData(Factors factors){
        this.factors = factors;

    }




    public Factors getFactors() {
        return this.factors; }

    @XmlElement(name="Factors")
    public void setFactors(Factors factors){
        this.factors = factors;
    }



}


