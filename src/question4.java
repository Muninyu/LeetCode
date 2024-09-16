import java.util.HashSet;

public class question4 {
    public static void main(String[] args){
        int[] a = {1,2,3,4,1,2,3,4,9,10};
        HashSet<Integer> setA=new HashSet<>();
        for(int i: a){
            setA.add(i);
            System.out.println(setA);
        }
    }
}
