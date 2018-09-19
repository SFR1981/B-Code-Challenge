import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Ref {


    public static void main(String[] args) {
        //TODO: implement detecting changes to input file
        //TODO:Parse Input file and create java objects relative to xml tags
        File file = new File("input/ReferenceData.xml");
        System.out.println(file);
        try {
            JAXBContext context = JAXBContext.newInstance(ReferenceData.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            ReferenceData referenceData = (ReferenceData) unmarshaller.unmarshal(file);
            System.out.println(referenceData);

        } catch (JAXBException e) {
            e.printStackTrace();

        }


    }

}

