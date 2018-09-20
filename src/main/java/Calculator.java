import Reference.Ref;
import Reference.ReferenceData;

import javax.xml.bind.JAXBException;

public class Calculator {

    Ref ref = new Ref();
    private ReferenceData referenceData;
    private double valueFactorLow;
    private double valueFactorMedium;
    private double valueFactorHigh;
    private double emissionsFactorLow;
    private double emissionsFactorMedium;
    private double emissionsFactorHigh;

    {
        try {
            referenceData = ref.getReference();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public Calculator() {
        assert referenceData != null;
        this.valueFactorLow = referenceData.getFactors().getValueFactor().getLow();
        this.valueFactorMedium = referenceData.getFactors().getValueFactor().getMedium();
        this.valueFactorHigh = referenceData.getFactors().getValueFactor().getHigh();
        this.emissionsFactorLow = referenceData.getFactors().getEmissionsFactor().getLow();
        this.emissionsFactorMedium = referenceData.getFactors().getEmissionsFactor().getMedium();
        this.emissionsFactorHigh = referenceData.getFactors().getEmissionsFactor().getHigh();
    }


    public double getValueFactorLow(){
        return valueFactorLow;
    }

    public void setValueFactorLow(double valueFactorLow) {
        this.valueFactorLow = valueFactorLow;
    }

    public double getValueFactorMedium() {
        return valueFactorMedium;
    }

    public void setValueFactorMedium(double valueFactorMedium) {
        this.valueFactorMedium = valueFactorMedium;
    }

    public double getValueFactorHigh() {
        return valueFactorHigh;
    }

    public void setValueFactorHigh(double valueFactorHigh) {
        this.valueFactorHigh = valueFactorHigh;
    }

    public double getEmissionsFactorLow() {
        return emissionsFactorLow;
    }

    public void setEmissionsFactorLow(double emissionsFactorLow) {
        this.emissionsFactorLow = emissionsFactorLow;
    }

    public double getEmissionsFactorMedium() {
        return emissionsFactorMedium;
    }

    public void setEmissionsFactorMedium(double emissionsFactorMedium) {
        this.emissionsFactorMedium = emissionsFactorMedium;
    }

    public double getEmissionsFactorHigh() {
        return emissionsFactorHigh;
    }



    public double getValueFactorForGenerator(WindGenerator windGenerator){
        if (windGenerator.getLocation() == "Onshore")
        return getValueFactorHigh();
        else return getValueFactorLow();

    }

    public double getValueFactorForGenerator(CoalGenerator coalGenerator){
        return getValueFactorMedium();
    }

    public double getValueFactorForGenerator(GasGenerator gasGenerator){
        return getValueFactorMedium();
    }

    public double getEmissionsFactorForGenerator(CoalGenerator coalGenerator){
        return getEmissionsFactorHigh();

    }

    public double getEmissionsFactorForGenerator(GasGenerator gasGenerator){
        return getEmissionsFactorMedium();
    }
}




