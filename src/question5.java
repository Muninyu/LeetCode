import java.util.Arrays;
import java.util.stream.Collector;

public class question5 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,1,2,3,4,9,10};
        int[] aPlus = Arrays.stream(a).map(n -> n+1).toArray();
        for (int i : aPlus){
            System.out.println(i);
        }
    }
}
