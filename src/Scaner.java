import java.util.List;
import java.util.Scanner;

public class Scaner extends BaseClass {
    protected static Scanner sc = new Scanner(System.in);

    protected static void PrintList(List<Integer> list) {
        for (Integer arr : list) {
            System.out.println(arr);
        }
    }
}