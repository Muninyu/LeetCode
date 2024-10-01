import java.util.HashSet;

public class problem217 {
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        containsDuplicate(nums);
    }
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i: nums){
            hashSet.add(i);
        }
        return hashSet.size() != nums.length;
    }
}
