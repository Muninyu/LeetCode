public class problem371 {
    public static void main(String[] args){
        int a = 1, b = 2;
        System.out.println(getSum(a,b));
    }
    public static int getSum(int a, int b){
        while (b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
