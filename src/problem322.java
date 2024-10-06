import java.util.Arrays;

public class problem322 {
    public static void main(String[] args){
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
    public static int coinChange(int[] coins, int amount){
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount + 1);
        minCoins[0] = 0;

        for(int i = 1; i <= amount; i++){
            for (int coin : coins) {
                if (i - coin >= 0) {
                    minCoins[i] = Math.min(minCoins[i], 1 + minCoins[i - coin]);
                }
            }
        }


        return minCoins[amount] != amount + 1? minCoins[amount] : -1;
    }
}
