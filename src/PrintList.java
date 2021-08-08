import java.security.PublicKey;
import java.util.List;

public class PrintList extends BaseClass{
    protected static void PrintList(List<Integer> list){
        for (Integer arr: list) {
            System.out.println(arr);
        }
    }
}
