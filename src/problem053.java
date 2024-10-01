import java.util.Arrays;
import java.util.OptionalInt;

public class problem053 {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        int ans = nums[0];
        int sum = 0;

        for (int i : nums){
            if (sum < 0){
                sum = 0;
            }
            sum = sum + i;
            ans = Math.max(ans, sum);
        }

        return ans;
    }
}
