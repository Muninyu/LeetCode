import java.util.Arrays;
import java.util.LinkedList;

public class problem057 {
    public static void main(String[] args){
//        int[][] intervals = {{1,3},{6,9}};
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
//        int[] newInterval = {2,5};
        int[] newInterval = {4,8};
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }
    public static int[][] insert(int[][] intervals, int[] newInterval){
        LinkedList<int[]> linkedListAns = new LinkedList<>();
        if(intervals == null || intervals.length == 0){
            return new int[][] {newInterval};
        }

        int iter = 0;
        int start = -1;
        int end = -1;
        int insertStart = newInterval[0];
        int insertEnd = newInterval[1];
        while(iter < intervals.length){
            if(start != -1){
                if(end != -1){
                    linkedListAns.add(intervals[iter]);
                } else if (intervals[iter][1] < insertEnd){

                } else if (intervals[iter][0] > insertEnd){
                    end = insertEnd;
                    linkedListAns.add(new int[] {start, end});
                    continue;
                } else if (intervals[iter][0] <= insertEnd) {
                    end = intervals[iter][1];
                    linkedListAns.add(new int[] {start, end});
                }
            } else if (intervals[iter][1] < insertStart){
                linkedListAns.add(intervals[iter]);
            } else if (intervals[iter][0] > insertStart){
                start = insertStart;
                continue;
            } else if (intervals[iter][0] <= insertStart) {
                start = intervals[iter][0];
                continue;
            }
            iter++;
        }

        if(end == -1){
            if(start == -1){
                start = insertStart;
                end = insertEnd;
                linkedListAns.add(new int[]{start,end});
            } else {
                end = insertEnd;
                linkedListAns.add(new int[]{start,end});
            }
        }

        int ansIter = 0;
        int[][] ans = new int[linkedListAns.size()][2];

        while(!linkedListAns.isEmpty()){
            ans[ansIter] = linkedListAns.pop();
            ansIter++;
        }

        return ans;
    }
}
