import java.util.Arrays;

public class problem238 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums){
        int numsLength = nums.length;
        int[] ans = new int[numsLength];
        int[] forward = new int[numsLength];
        int[] backward = new int[numsLength];
        forward[0] = 1;
        backward[numsLength - 1] = 1;
        for (int i = 1; i < numsLength;i++){
            forward[i] = forward[i-1] * nums[i-1];
        }
        for (int i = numsLength - 2; i >= 0; i--){
            backward[i] = backward[i+1] * nums[i+1];
        }
        for(int i = 0; i < numsLength; i++){
            ans[i] = forward[i] * backward[i];
        }
        return ans;
    }
}
