import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution700 extends Scaner {
    public static void main(String[] args) {
        ArrayList <String> arr = new ArrayList<>();
        arr.add("мама");
        arr.add("мыла");
        arr.add("раму");
        String word = "именно";
        arr.add(1, word);
        arr.add(3, word);
        arr.add(5, word);
        for (String arrayList : arr) {
            System.out.println(arrayList);
        }

        }
        }









