public class question8 {
    public static void main(String[] args){
        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.printf("%d * %d = %d",j,i,i*j);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
