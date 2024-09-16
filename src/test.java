import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.util.Collections.sort;

public class test {
    public static void main(String[] args){
        //question1
        int k = 5;
        for(int i = 0; i < k; i++){
            for(int j = 0; j < k - i - 1; j++){
                System.out.print(" ");
            }
            for(int m = 0; m < 2 * (i + 1) - 1; m++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = 0; i < k - 1; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print(" ");
            }
            for(int m = 0; m < 2 * (k - i - 1) - 1; m++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //question2
        int[] q2 = {1,2,3,1,2,3,4};
        HashSet<Integer> hashSetQ2 = new HashSet<>();
        for(int i:q2){
            hashSetQ2.add(i);
        }
        System.out.println(hashSetQ2);

        //question3
        int[] q3 = {1,2,3,4,1,2};
        int[] ans3 = Arrays.stream(q3).map(n -> n+1).toArray();
        for(int i: ans3){
            System.out.println(i);
        }

        //question4
        Date q4 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println(sdf.format(q4));
        LocalDateTime q41 = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println(q41.format(dtf));

        //question5
        LinkedList<String> q51 = new LinkedList<>();
        q51.add("E");
        q51.add("B");
        q51.add("A");
        q51.add("D");
        q51.add("C");
        HashMap<Integer, LinkedList> hashMap = new HashMap<>();
        hashMap.put(1,q51);
        LinkedList<String> temp = new LinkedList<>();
        temp = hashMap.get(1);
        sort(temp);
        hashMap.put(1,temp);
        System.out.println(hashMap);
    }
}
