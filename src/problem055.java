import java.util.Arrays;

public class problem055 {
    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums){
        boolean[] dp = new boolean[nums.length];
        Arrays.fill(dp, false);
        dp[0] = true;
        for(int i = 0; i < dp.length; i++){
            if(dp[i]){
                int step = 1;
                while(step <= nums[i] && i + step < nums.length){
                    dp[i + step] = true;
                    step++;
                }
            }
        }
        return dp[nums.length - 1];
    }
}
