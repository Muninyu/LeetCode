public class problem2938 {
    public static void main(String[] args){
        String s = "100";
        System.out.println(minimumSteps(s));
    }
    public static long minimumSteps(String s){
        int front = 0;
        int back = s.length() - 1;
        long change = 0;
        while(front < back){
            if(s.charAt(front) == '0'){
                front++;
                continue;
            }
            if(s.charAt(back) == '1'){
                back--;
                continue;
            }
            change = change + back - front;
            front++;
            back--;
        }
        return change;
    }
}
