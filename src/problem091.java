public class problem091 {
    public static void main(String[] args){
        String s = "12";
        System.out.println(numDecodings(s));
    }
    public static int numDecodings(String s){
        int[] dp = new int[s.length()];
        if(Integer.parseInt(s.substring(0,1)) != 0){
            dp[0] = 1;
        } else {
            return 0;
        }
        for (int i = 1; i < dp.length; i++){
            int prev1 = Integer.parseInt(s.substring(i-1, i));
            int prev2 = Integer.parseInt(s.substring(i,i+1));
            if((prev1 == 2 && prev2 < 7) || prev1 == 1){
                if(i-2 < 0){
                    dp[i]++;
                } else {
                    dp[i] = dp[i] + dp[i-2];
                }
            }
            if(prev2 != 0){
                dp[i] = dp[i] + dp[i-1];
            }
        }
        return dp[s.length() - 1];
    }
}
