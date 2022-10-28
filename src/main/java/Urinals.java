/*Ryan Collins*/

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Urinals {

    static ArrayList<String> get(String file) throws Exception {
        File reader;
        Scanner myReader;
        ArrayList<String> string_list = new ArrayList<>();
        try {
            reader = new File(file);
            myReader = new Scanner(reader);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                data = data.concat("0");
                string_list.add(data);
            }
            myReader.close();
            return string_list;
        }
        catch(Exception e){
            System.out.println(e);
            return string_list;
        }
    }

    public static void main(String[] args) {
    }
}
