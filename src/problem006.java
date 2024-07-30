import java.util.LinkedList;

public class problem006 {
    public problem006() {
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        LinkedList[] listCharS = new LinkedList[numRows];

        int tempS;
        for(tempS = 0; tempS < numRows; ++tempS) {
            listCharS[tempS] = new LinkedList();
        }

        tempS = 0;
        int i = 0;

        for(int iterI = -1; tempS != s.length(); ++tempS) {
            listCharS[i].add(s.charAt(tempS));
            if (i == 0 || i == numRows - 1) {
                iterI *= -1;
            }

            if (numRows != 1) {
                i += iterI;
            }
        }

        StringBuilder ansS = new StringBuilder();
        LinkedList[] var8 = listCharS;
        int var9 = listCharS.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            LinkedList c = var8[var10];

            for(int j = 0; j < c.size(); ++j) {
                ansS.append(c.get(j));
            }
        }

        String ans = ansS.toString();
    }
}