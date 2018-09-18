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

    @XmlElement(name="Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="Generation")
    public Generation getGeneration() {
        return generation;
    }

    public void setGeneration(Generation generation) {
        this.generation = generation;
    }
}


