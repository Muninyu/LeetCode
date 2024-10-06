import java.util.Arrays;

public class problem377 {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int target = 4;
        System.out.println(combinationSum4(nums, target));
    }
    public static int combinationSum4(int[] nums, int target){
        int[] dp = new int[target + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for(int i = 1; i < dp.length; i++){
            for(int num: nums){
                if(i - num >= 0 && dp[i - num] > 0){
                    dp[i] = dp[i] + dp[i - num];
                }
            }
        }
        return dp[target];
    }
}
