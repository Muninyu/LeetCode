import java.util.ArrayList;
import java.util.List;

public class problem300 {
    public static void main(String[] args){
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums){
        List<Integer> LIS = new ArrayList<>();

        for(int i: nums){
            if(LIS.isEmpty() || LIS.getLast() < i){
                LIS.add(i);
            } else {
                int idx = binarySearch(LIS, i);
                LIS.set(idx, i);
            }
        }

        return LIS.size();
    }
    public static int binarySearch(List<Integer> nums, int target){
        int left = 0;
        int right = nums.size() - 1;

        while (left <= right){
            int mid = (left + right) / 2;
            if(nums.get(mid) == target) {
                return mid;
            } else if (nums.get(mid) > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
