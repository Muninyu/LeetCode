import java.math.BigInteger;

public class problem190 {
    public static void main (String[] args){
        // java的int 沒辦法存大於2^32次方，題目較適用於C/C++，在這裡進行運算會是錯的
        int n = 10;
        System.out.println(reversBits(n));
    }
    public static int reversBits(int n){
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans = (ans << 1) | (n & 1);
            n = n >>> 1;
        }

        return ans;
    }
}
