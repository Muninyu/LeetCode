public class problem005 {
    public static void main(String[] args){
        String s = "babad";
        char[] charS = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            charS[i] = s.charAt(i);
        }
        int start = 0;
        int end = 0;
        int length = 0;
        for(int i = 0; i < s.length(); i++){
            int temp = 1;
            int tempStart = i;
            int tempEnd = i;
            int tempLength = 1;
            boolean lock1 = false;
            boolean lock2 = false;
            boolean lock3 = false;
            while (i + temp < s.length() && i - temp >= 0 && charS[i + temp] == charS[i - temp]){
                tempStart = i - temp;
                tempEnd = i + temp;
                tempLength = tempEnd - tempStart + 1;
                if (tempLength > length){
                    start = tempStart;
                    end = tempEnd;
                    length = tempLength;
                }
                temp = temp + 1;
            }

        }
        for(int i = 0; i < s.length(); i++){
            int temp = 1;
            int tempStart = i;
            int tempEnd = i;
            int tempLength = 1;
            boolean lock1 = false;
            boolean lock2 = false;
            boolean lock3 = false;
            while (i + temp < s.length() && i - temp + 1 >= 0 && charS[i + temp] == charS[i - temp + 1]){
                tempStart = i - temp + 1;
                tempEnd = i + temp;
                tempLength = tempEnd - tempStart + 1;
                if (tempLength > length){
                    start = tempStart;
                    end = tempEnd;
                    length = tempLength;
                }
                temp = temp + 1;
            }

        }
        String ans = s.substring(start, end + 1);
    }
}
