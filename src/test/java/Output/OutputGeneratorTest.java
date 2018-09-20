package Output;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputGeneratorTest {

    OutputGenerator outputGenerator = new OutputGenerator("name", 0.1);

    @Test
    void getName(){
        assertEquals("name", outputGenerator.getName());
    }

    @Test
    void setName() {
        outputGenerator.setName("newName");
        assertEquals("newName", outputGenerator.getName());

    }

    @Test
    void getTotal() {
        assertEquals(0.1, outputGenerator.getTotal());
    }

    @Test
    void setTotal() {
        outputGenerator.setTotal(0.2);
        assertEquals(0.2, outputGenerator.getTotal());
    }
}