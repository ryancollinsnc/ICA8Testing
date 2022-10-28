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
    static ArrayList<Integer> calc(ArrayList<String> string_list) {
        int ans=0;
        ArrayList<Integer> answer=new ArrayList<>();
        for (String check : string_list) {
            for (int i = 0; i < check.length(); i++) {
                if (check.charAt(i) == '0') {
                    if (i == 0 && check.charAt(i + 1) == '0' && check.charAt(i) == '0') { // If at first element
                        ans++;
                        check = check.substring(0, i) + '1' + check.substring(i + 1);
                    } else if (i == check.length() - 1 && check.charAt(i) == '0' && check.charAt(i - 1) == '0') { // If at last element
                        ans++;
                        check = check.substring(0, i) + '1' + check.substring(i + 1);
                    } else if (check.charAt(i - 1) == '0' && check.charAt(i) == '0' && check.charAt(i + 1) == '0') { // If in the middle
                        ans++;
                        check = check.substring(0, i) + "1" + check.substring(i + 1);
                    }
                }
            }
            if(ans==0){
                ans=-1;
            }
            answer.add(ans);
            ans = 0;
        }
        System.out.println("Count Check Worked");
        return answer;
    }

    public static void main(String[] args) {
    }
}
