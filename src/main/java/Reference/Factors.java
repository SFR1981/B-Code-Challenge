package Reference;

import Reference.ValueFactor;

import javax.xml.bind.annotation.XmlElement;

public class Factors {

    private ValueFactor valueFactor;
    private EmissionsFactor emissionsFactor;




    public Factors(ValueFactor valueFactor, EmissionsFactor emissionsFactor) {
        this.valueFactor = valueFactor;
        this.emissionsFactor = emissionsFactor;
    }

    public Factors(){}


    public ValueFactor getValueFactor() {
        return this.valueFactor;
    }

    @XmlElement(name="ValueFactor")
    public void setValueFactor(ValueFactor valueFactor){
        this.valueFactor = valueFactor;
    }


    public EmissionsFactor getEmissionsFactor() {
        return this.emissionsFactor;
    }

    @XmlElement(name="EmissionsFactor")
    public void setEmissionsFactor(EmissionsFactor emissionsFactor){
        this.emissionsFactor = emissionsFactor;
    }


}

