public class question9 {
    public static void main(String[] args){
        int n = 5;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < (n-i); j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1;k++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
        for(int i = 0; i < n - 1; i++){
            for (int j = 0; j < i + 2; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < (n - i - 1);k++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
