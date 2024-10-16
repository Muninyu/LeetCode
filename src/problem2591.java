public class problem2591 {
    public static void main(String[] args){
        int money = 12;
        int children = 3;
        System.out.println(distMoney(money, children));
    }
    public static int distMoney(int money, int children){
        int[] dp = new int[children];
        int childrenIter = 0;

        if(money < children) return -1;

        while(money > 0 && childrenIter < children){
            if(money >= 8 && money - 8 >= children - childrenIter - 1){
                dp[childrenIter] = 8;
                money = money - 8;
                childrenIter++;
            } else if (money == 4 && childrenIter > 0) {
                if(childrenIter == children - 1){
                    dp[childrenIter-1]++;
                    dp[childrenIter] = 3;
                    money = money - 4;
                } else {
                    dp[childrenIter] = 4;
                    money = money - 4;
                }
            } else if(money == 8 && childrenIter != children - 1){
                dp[childrenIter] = money - 1;
                dp[childrenIter + 1] = 1;
                money = 0;
            } else {
                dp[childrenIter] = money;
                money = 0;
            }
        }
        if(childrenIter == children){
            dp[childrenIter-1] = dp[childrenIter-1] + money;
        }

        int ans = 0;
        for (int i: dp){
            if (i == 8) ans++;
        }

        return ans;
    }
}
