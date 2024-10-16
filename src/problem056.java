import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class problem056 {
    public static void main(String[] args){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        ArrayList<int[]> arrayListAns = new ArrayList<>();
        arrayListAns.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int iter = 0;
            boolean change = false;
            while(iter < arrayListAns.size()){
                if(intervals[i][0] <= arrayListAns.get(iter)[1]){
                    arrayListAns.get(iter)[0] = Math.min(intervals[i][0],arrayListAns.get(iter)[0]);
                    arrayListAns.get(iter)[1] = Math.max(intervals[i][1],arrayListAns.get(iter)[1]);
                    change = true;
                }
                iter++;
            }
            if(!change){
                arrayListAns.add(intervals[i]);
            }
        }
        int[][] ans = new int[arrayListAns.size()][2];
        for(int i = 0; i < arrayListAns.size(); i++){
            ans[i] = arrayListAns.get(i);
        }
        return ans;
    }
}
