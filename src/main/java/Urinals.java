/*Ryan Collins*/

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Urinals {

    static ArrayList<String> gett(String file) throws Exception {
        File reader;
        Scanner myReader;
        ArrayList<String> string_list = new ArrayList<>();
        try {
            reader = new File(file);
            myReader = new Scanner(reader);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
               // data = data.concat("0");
                string_list.add(data);
            }
            myReader.close();
        }
        catch(Exception e){
            System.out.println(e);
            return string_list;
        }

        if(string_list.isEmpty()){
            System.out.println("File is empty");
            return string_list;
        }
        System.out.println("File read Successfully");
        return string_list;
    }

    public static void main(String[] args) {
    }
}
