import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class question7 {
    public static void main(String[] args){
        ArrayList a = new ArrayList();
        a.add("E");
        a.add("B");
        a.add("A");
        a.add("D");
        a.add("C");

        HashMap map1 = new HashMap<>();
        map1.put(1, a);

        ArrayList b = (ArrayList) map1.get(1);
        Collections.sort(b);

        System.out.println(b);
    }
}
