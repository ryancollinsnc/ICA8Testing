import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    @org.junit.jupiter.api.Test
    void get() throws Exception {
        ArrayList<String> inp= new ArrayList<>();
        System.out.println("Ryan Collins ** Test One Executed");
        assertEquals(inp, Urinals.gett("urinals1.dat"));

       System.out.println("Ryan Collins ** Test two Executed");
        assertEquals(inp, Urinals.gett("urinals2.dat"));

        inp.add("000");

        System.out.println("Ryan Collins ** Test three Executed");
        assertEquals(inp, Urinals.gett("urinals.dat"));
    }
}