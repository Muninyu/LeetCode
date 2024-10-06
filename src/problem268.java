import java.util.Arrays;

public class problem268 {
    public static void main(String[] args){
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums){
        int[] temp = new int[nums.length + 1];
        Arrays.fill(temp, -1);
        for(int i = 0; i < nums.length; i++){
            temp[nums[i]] = nums[i];
        }
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == -1) {
                return i;
            }
        }
        return 0;
    }
}
