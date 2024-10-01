public class problem009 {
    public static void main(String[] args){
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        String stringX = Integer.toString(x);
        char[] charX = stringX.toCharArray();
        int length = charX.length;
        for(int i = 0; i < length/2; i++){
            char temp = charX[i];
            charX[i] = charX[length - i - 1];
            charX[length - i - 1] = temp;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char i:charX){
            stringBuilder.append(i);
        }
        String revStringX = stringBuilder.toString();
        System.out.println(stringX);
        return stringX.equals(revStringX);
    }
}
