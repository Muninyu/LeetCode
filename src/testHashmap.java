import java.util.*;

public class testHashmap {
    public static void main(String[] args){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple",2);
        hashMap.put("banana",5);
        System.out.println(hashMap);

        int a = hashMap.get("apple");
        System.out.println(a);

        Set<Map.Entry<String, Integer>> b = hashMap.entrySet();
        System.out.println(b);

        hashMap.merge("apple",3,(oldValue,newValue) -> oldValue + newValue);
        System.out.println(hashMap);

        Map<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("apple",2);
        hashMap2.put("banana",5);
        System.out.println(hashMap2);
        hashMap2.putAll(hashMap);
        System.out.println(hashMap2);

        hashMap.remove("banana");
        System.out.println(hashMap);

        hashMap.replace("apple",3);
        System.out.println(hashMap);

        hashMap.replace("apple",2,4);
        System.out.println(hashMap);

        int c = hashMap.size();
        System.out.println(c);

        Collection<Integer> d = hashMap2.values();
        System.out.println(d);

        hashMap.clear();
        System.out.println(hashMap);

        boolean e = hashMap.isEmpty();
        System.out.println(e);

    }
}
