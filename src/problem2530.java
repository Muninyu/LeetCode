import java.util.Arrays;
import java.util.PriorityQueue;

public class problem2530 {
    public static void main(String[] args){
        int[] nums = {1,10,3,3,3};
        int k = 3;
        System.out.println(maxKelements(nums, k));
    }
    public static long maxKelements(int[] nums, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            priorityQueue.offer(num);
        }
        long finalScore = 0;
        int last = nums.length - 1;
        while(k > 0 && !priorityQueue.isEmpty()){
            int maxNum = priorityQueue.poll();
            finalScore = finalScore + maxNum;
            int res = (maxNum % 3 != 0)? 1:0;
            priorityQueue.offer(maxNum / 3 + res);
            k--;
        }
        return finalScore;
    }
}
