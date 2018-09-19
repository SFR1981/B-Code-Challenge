import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

public class Watcher {

    public static void main(String[] args) {

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
                    makeReport(eventPath);
                    System.out.println(eventPath);
                }

            } while (watchKey.reset());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void makeReport(Path eventPath) {
        System.out.println("I am making the report with all the things!");
        File inputFile = new File("input/"+ eventPath);
        System.out.println(inputFile);
        try {
            JAXBContext context = JAXBContext.newInstance(GenerationReport.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            GenerationReport generationReport = (GenerationReport) unmarshaller.unmarshal(file);
            System.out.println(generationReport);
            System.out.println(generationReport.getCoal().getCoalGenerators().size());
        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }
}
