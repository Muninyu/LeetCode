import java.util.LinkedList;

public class problem008 {
    public static void main(String[] args){
        String s = "+123";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        char[] charS = s.toCharArray();
        int ansIter = 0;
        LinkedList<Character> linkedListAns = new LinkedList<>();
        for(char i : charS){
            if(Character.isDigit(i)){
                linkedListAns.add(i);
                ansIter++;
            } else {
                if (i == '+'){
                    if (ansIter != 0){
                        break;
                    }
                    ansIter++;
                } else if (i == '-') {
                    if (ansIter == 0){
                        linkedListAns.add(i);
                        ansIter++;
                    } else  {
                        break;
                    }
                } else if (i == ' '){
                    if (ansIter != 0){
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        char[] charAns = new char[linkedListAns.size()];
        int i = 0;
        String stringAns;
        if (linkedListAns.isEmpty()){
            stringAns = "0";
        } else {
            while (!linkedListAns.isEmpty()){
                charAns[i] = linkedListAns.pop();
                i++;
            }
            stringAns = String.valueOf(charAns);
            if (stringAns.equals("-")){
                stringAns = "0";
            }
        }
        int ans;
        try {
            ans = Integer.parseInt(stringAns);
        } catch (Exception e){
            if(stringAns.charAt(0) == '-'){
                ans = -2147483648;
            } else {
                ans = 2147483647;
            }
        }
        return ans;
    }
}
