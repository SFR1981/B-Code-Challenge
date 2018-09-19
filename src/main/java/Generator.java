import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

public abstract class Generator {

    private String name;
    private Generation generation;

    public Generator(){}

    public Generator(String name, Generation generation){
        this.name = name;
        this.generation = generation;
    }


    public String getName() {
        return this.name;
    }

    //@XmlElement(name="Name")
    public void setName(String name) {
        this.name = name;
    }



    public Generation getGeneration() {
        return this.generation;
    }

    //@XmlElement(name="Generation")
    public void setGeneration(Generation generation) {
        this.generation = generation;
    }
}


