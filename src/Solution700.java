import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution700 extends Methods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            list.add(sc.nextLine());
        }
            ArrayList<String> result = doubleValues(list);
            for (String s: result) {
                System.out.println(s);
            }

        }
        public static ArrayList<String> doubleValues(ArrayList<String> list){
            for (int i = 0; i <list.size() ; i += 2) {
                list.add(i + 1, list.get(i));
            }
            return list;
        }
    }











