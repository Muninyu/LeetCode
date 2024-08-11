public class problem003 {
    public static void main(String[] args){
        String s = "abcabcbb";
        char[] store = new char[s.length()];
        int temp = 0;
        int temp2 = 0;
        int ans = 0;
        for(int i = 0; i < s.length();i++){
            store[i] = s.charAt(i);
            for(int j = i - 1 ; j >= temp;j--){
                if(store[i] == store[j]){
                    temp = j + 1;
                    break;
                }
            }
            temp2 = i - temp + 1;
            if (temp2 > ans){
                ans = temp2;
            }
        }
        if(s.length() == 1){
            ans = 1;
        }
        System.out.println(ans);
    }
}
