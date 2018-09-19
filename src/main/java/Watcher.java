import java.nio.file.FileSystems;
import java.nio.file.WatchService;

public class Watcher {

    public static void main(String[] args) {

        try (WatchService service = FileSystems.getDefault().newWatchService()){

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
