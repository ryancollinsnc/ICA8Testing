import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    @org.junit.jupiter.api.Test
    void get() throws Exception {
        ArrayList<String> inp= new ArrayList<>();
        System.out.println("Ryan Collins ** Test One Executed");
        assertEquals(inp, Urinals.get("urinals.dat"));
    }
}