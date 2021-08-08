import java.io.IOException;
import java.util.ArrayList;

public class Solution700 extends Scaner {
    public static void main(String[] args) throws IOException {
    ArrayList <Integer> list = new ArrayList<>();
        System.out.println("Enter 20 int numbers: ");

        for (int i = 0; i <10 ; i++) {
            int a = Integer.parseInt(sc.nextLine());
            list.add(a);
        }
        ArrayList <Integer> three = new ArrayList<>();
        ArrayList <Integer> two = new ArrayList<>();
        ArrayList <Integer> another = new ArrayList<>();

        for (int arr: list) {
          if (arr%3 == 0)
              three.add(arr);
        }
        for (int arr: list) {
            if (arr % 2 == 0)
                two.add(arr);
        }
        for (int arr: another) {
            if ((arr % 3 != 0) && (arr % 2 != 0))
                another.add(arr);

        }
        System.out.println("Arr three");
        PrintList(three);
        System.out.println("Arr two");
        PrintList(two);
        System.out.println("Arr another");
        PrintList(another);

    }
}







