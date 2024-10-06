public class problem070 {
    public static void main(String[] args){
        int n = 1;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n){
        int prev1 = 0;
        int prev2 = 1;
        int ans = 1;
        for(int i = 0; i < n; i++){
            ans = prev1 + prev2;
            prev1 = prev2;
            prev2 = ans;
        }
        return ans;
    }
}
