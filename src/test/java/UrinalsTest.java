import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UrinalsTest {

    @org.junit.jupiter.api.Test
    void gett() {
        ArrayList<String> inp= new ArrayList<>();
        System.out.println("Ryan Collins ** Test One Executed");
        assertEquals(inp, Urinals.gett("urinals1.dat"));

       System.out.println("Ryan Collins ** Test two Executed");
        assertEquals(inp, Urinals.gett("urinals2.dat"));

        inp.add("100001");
        inp.add("00000");
        inp.add("10001");
        inp.add("0011");
        inp.add("1100");
        inp.add("00");
        inp.add("01");
        inp.add("10");
        inp.add("0");
        inp.add("1");

        System.out.println("Ryan Collins ** Test three Executed");
        assertEquals(inp, Urinals.gett("urinals.dat"));
    }

    @Test
    void calc() {
        ArrayList<Integer> op=new ArrayList<>();
        ArrayList<String> chk=new ArrayList<>();
        chk.add("000");
        chk.add("0011");
        chk.add("1100");
        chk.add("011");
        op.add(2);
        op.add(1);
        op.add(1);
        op.add(-1);
        assertEquals(op, Urinals.calc(chk));
    }

    @Test
    void print() {
        ArrayList<Integer> op=new ArrayList<>();

        System.out.println("Ryan Collins ** Test one executed");
        assertEquals(0, Urinals.print(op));
        op.add(2);
        op.add(1);
        op.add(1);
        op.add(-1);
        System.out.println("Ryan Collins ** Test Two and Three executed");
        assertEquals(0, Urinals.print(op));
    }
}