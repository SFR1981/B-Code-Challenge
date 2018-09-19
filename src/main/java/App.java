import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class App {

    public static void main(String[] args) {
        //TODO: implement detecting changes to input file

        //TODO:Parse Input file and create java objects relative to xml tags
        File file = new File("input/GenerationReport.xml");
        System.out.println(file);
        try {
            JAXBContext context = JAXBContext.newInstance(GenerationReport.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            GenerationReport generationReport = (GenerationReport) unmarshaller.unmarshal(file);
           System.out.println(generationReport);
        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }

    }

