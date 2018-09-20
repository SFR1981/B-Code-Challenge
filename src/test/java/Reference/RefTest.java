package Reference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RefTest {



    @Test
    void getReference() {
        try{
            ReferenceData ref = Ref.getReference();
            assertNotNull(ref.getFactors());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}