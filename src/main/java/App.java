import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        //Watch for new file entering folder - title of file can be anything
        // but schema must match GenerationReport.xml
        try (WatchService service = FileSystems.getDefault().newWatchService()) {
            Map<WatchKey, Path> keyMap = new HashMap<>();
            Path path = Paths.get("input");
            keyMap.put(path.register(service,
                    StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_MODIFY), path);

            WatchKey watchKey;

            do {
                watchKey = service.take();
                Path eventDir = keyMap.get(watchKey);

                for (WatchEvent<?> event : watchKey.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    Path eventPath = (Path) event.context();
                    //pass path of file to makeReport()
                    makeReport(eventPath);

                }

            } while (watchKey.reset());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void makeReport(Path eventPath) {
        Calculator calculator = new Calculator();

        //get file
        File inputFile = new File("input/"+ eventPath);

        try {
            JAXBContext context = JAXBContext.newInstance(GenerationReport.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            //create object generationReport
            GenerationReport generationReport = (GenerationReport) unmarshaller.unmarshal(inputFile);
            //pass to createOutput
            CreateOutput.createObjects(generationReport);
        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }



}
