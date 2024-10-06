import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem139 {
    public static void main(String[] args){
        String s = "leetcode";
        ArrayList<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(wordBreak(s, wordDict));
    }
    public static boolean wordBreak(String s, List<String> wordDict){
        boolean[] dp = new boolean[s.length() + 1];
        Arrays.fill(dp, false);
        dp[0] = true;

        for(int i = 1; i < dp.length; i++){
            for(String string: wordDict){
                if (s.startsWith(string, i - 1) && dp[i - 1]){
                    if(i + string.length() - 1 <= s.length()){
                        dp[i + string.length() - 1] = true;
                    }
                }
            }
        }
        return dp[s.length()];
    }
}
