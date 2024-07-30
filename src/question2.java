public class question2 {
    public static void main(String[] args) {
        int temp1 = 1;
        int temp2 = 1;
        int n = 10;

        for(int i = 3; i <= n; ++i) {
            int temp3 = temp1 + temp2;
            temp1 = temp2;
            temp2 = temp3;
            System.out.println(temp3);
        }

    }
}
