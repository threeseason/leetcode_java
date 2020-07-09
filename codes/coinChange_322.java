import java.util.Arrays;
//给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
//如果没有任何一种硬币组合能组成总金额，返回 -1


class coinChange {
    public int main(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++)
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        for(int k=0;k*coins[0]<=amount;k++)
            dp[0][k*coins[0]]=k;
        for(int i=1;i<coins.length;i++)
            for(int j=0;j<=amount;j++)
            	if(j>=coins[i]){
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
                }
        System.out.println(dp[coins.length-1][amount]);
        return dp[coins.length-1][amount]==Integer.MAX_VALUE?-1:dp[coins.length-1][amount];
    }
}
public class coinChange_322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coinChange cc = new coinChange();
		int[] coins = {2,5,10,1};
		int amount = 27;
		System.out.println(cc.main(coins, amount));
	}

}
