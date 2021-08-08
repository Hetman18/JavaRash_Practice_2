import java.io.IOException;
import java.util.ArrayList;

public class Solution700 extends Scaner {
    public static void main(String[] args) {
    ArrayList <String> list = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            list.add(sc.nextLine());
        }
        list.remove(2);

        for (int i = list.size() -1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        }
    }








