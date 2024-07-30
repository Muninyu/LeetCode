public class problem007 {
    public static void main(String[] args) {
        int x = 1534236469;
        String stringX = Integer.toString(x);
        char[] charX = new char[stringX.length()];
        for(int i = 0; i < stringX.length(); i++){
            charX[i] = stringX.charAt(stringX.length() - 1 - i);
        }
        if(isDigit(charX[stringX.length() - 1])){
            StringBuilder ansX = new StringBuilder();
            for(int i = 0; i < stringX.length(); i++){
                ansX.append(charX[i]);
            }
            int ans;
            try{
                ans = Integer.parseInt(ansX.toString());
            }catch (NumberFormatException e){
                ans = 0;
            }
            System.out.println(ans);
//          return ans;
        }else {
            StringBuilder ansX = new StringBuilder();
            ansX.append(charX[stringX.length() - 1]);
            for(int i = 0; i < stringX.length() - 1; i++){
                ansX.append(charX[i]);
            }
            int ans;
            try{
                ans = Integer.parseInt(ansX.toString());
            }catch (NumberFormatException e){
                ans = 0;
            }
            System.out.println(ans);
//          return ans;
        }

    }
    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
