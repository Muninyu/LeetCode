public class problem062 {
    public static void main(String[] args){
        int m = 5, n = 5;
        System.out.println(uniquePaths(m, n));
    }
    public static int uniquePaths(int m, int n){
        int largeStep = Math.max(m-1, n-1), lessStep = Math.min(m-1, n-1); //4 4
        double doubleAns = 1;
        for (int i = 0; i < lessStep; i++){
            doubleAns = doubleAns * ((largeStep + lessStep) - i) / (i + 1) ;
        }

        return (int) doubleAns;
    }
}
