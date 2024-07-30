import java.util.LinkedList;

public class problem006 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";  //14
        int numRows = 3;

        LinkedList[] listCharS = new LinkedList[numRows];

        for(int i = 0; i < numRows; i++){
            listCharS[i] = new LinkedList<>();
        }

        int tempS = 0;
        int i = 0;
        int iterI = -1;
        while(tempS != s.length()){
            listCharS[i].add(s.charAt(tempS));
            if(i == 0 || i == numRows - 1){
                iterI = iterI * (-1);
            }
            if(numRows != 1){
                i = i + iterI;
            }
            tempS++;
        }
        StringBuilder ansS = new StringBuilder();
        for (LinkedList c :listCharS){
            for (int j = 0; j < c.size(); j++){
                ansS.append(c.get(j));
            }
        }
        String ans = ansS.toString();
//        return ans;
    }
}
