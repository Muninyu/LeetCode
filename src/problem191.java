public class problem191 {
    public static void main(String[] args){
        int n = 11;
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n){
        int ans = 0;
        for(int i = 0; i < 32; i++){
            if(((n >> i) & 1) == 1){
                ans += 1;
            }
        }
        return ans;
    }
}
