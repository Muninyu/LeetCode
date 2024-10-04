import java.lang.reflect.Array;
import java.util.Arrays;

public class problem338 {
    public static void main(String[] args){
        int n = 10;
        System.out.println(Arrays.toString(countBits(n)));
    }
    public static int[] countBits(int n){
        int[] ans = new int[n + 1];
        for(int i = 0; i < n + 1; i++){
            for(int j = 0; j < 32; j++){
                if(((i >> j) & 1) == 1){
                    ans[i]++;
                }
            }
        }
        return ans;
    }
}
