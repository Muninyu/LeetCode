public class problem1143 {
    public static void main(String[] args){
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(longestCommonSubsequence(text1, text2));
    }
    public static int longestCommonSubsequence(String text1, String text2){
        int[] dp = new int[text1.length()];
        int longest = 0;

        for(char c: text2.toCharArray()){
            int curLength = 0;
            for(int i = 0; i < text1.length(); i++){
                if(curLength < dp[i]){
                    curLength = dp[i];
                } else if (c == text1.charAt(i)) {
                    dp[i] = curLength + 1;
                    longest = Math.max(longest, curLength + 1);
                }
            }
        }

        return longest;
    }
}
