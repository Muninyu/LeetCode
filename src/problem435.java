import java.util.Arrays;
import java.util.LinkedList;

public class problem435 {
    public static void main(String[] args){
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
    public static int eraseOverlapIntervals(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int prev_end = intervals[0][1];
        int ans = 0;

        for(int i = 1; i < intervals.length; i++){
            if(prev_end > intervals[i][0]){
                ans++;
            } else {
                prev_end = intervals[i][1];
            }
        }

        return ans;
    }
}
