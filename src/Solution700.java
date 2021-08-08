import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution700  {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("лира");
        list.add("лава");
        list.add("работа");
        list.add("рыбалка");

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); ) {
            if (list.get(i).contains("р") && list.get(i).contains("л"))
                i++;
            else if (list.get(i).contains("л")) {
                list.add(i, list.get(i));
                i += 2;
            } else if (list.get(i).contains("р")) {
                list.remove(i);
                i++;
            }

        }
        return list;
    }
}










