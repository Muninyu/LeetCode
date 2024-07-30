public class problem007 {
    public static void main(String[] args) {
        int x = 1534236469;
        String stringX = Integer.toString(x);
        char[] charX = new char[stringX.length()];

        for(int i = 0; i < stringX.length(); ++i) {
            charX[i] = stringX.charAt(stringX.length() - 1 - i);
        }

        int ans;
        StringBuilder ansX;
        if (isDigit(charX[stringX.length() - 1])) {
            ansX = new StringBuilder();

            for(ans = 0; ans < stringX.length(); ++ans) {
                ansX.append(charX[ans]);
            }

            try {
                ans = Integer.parseInt(ansX.toString());
            } catch (NumberFormatException var8) {
                ans = 0;
            }

            System.out.println(ans);
        } else {
            ansX = new StringBuilder();
            ansX.append(charX[stringX.length() - 1]);

            for(ans = 0; ans < stringX.length() - 1; ++ans) {
                ansX.append(charX[ans]);
            }

            try {
                ans = Integer.parseInt(ansX.toString());
            } catch (NumberFormatException var7) {
                ans = 0;
            }

            System.out.println(ans);
        }

    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }
}
