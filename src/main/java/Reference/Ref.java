package Reference;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Ref {


    public static ReferenceData getReference() throws JAXBException {
        ReferenceData referenceData = null;
        File file = new File("static/ReferenceData.xml");
        try {
            JAXBContext context = JAXBContext.newInstance(ReferenceData.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            referenceData = (ReferenceData) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();

        } return referenceData;
    }



};












