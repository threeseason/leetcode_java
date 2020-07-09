//爱丽丝参与一个大致基于纸牌游戏 “21点” 规则的游戏，描述如下：
//
//爱丽丝以 0 分开始，并在她的得分少于 K 分时抽取数字。 抽取时，她从 [1, W] 的范围中随机获得一个整数作为分数进行累计，其中 W 是整数。 每次抽取都是独立的，其结果具有相同的概率。
//
//当爱丽丝获得不少于 K 分时，她就停止抽取数字。 爱丽丝的分数不超过 N 的概率是多少？


//使用动态规划，dp[x]表示以当目前点数为x时的获胜概率，当x>=k&&x<=Math.min(N,K+W-1)时dp[x]=1
public class new21Game_837 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10, K = 1, W = 10;
		System.out.println(new21Game(N,K,W));
	}
	public static double new21Game(int N, int K, int W) {
        if(K==0)
            return 1.0;
        double[] dp=new double[K+W+1];
        for(int i=K;i<=N&&i<=K+W-1;i++)
            dp[i]=1.0;
        dp[K-1]=(1.0*Math.min(N,K+W-1)-K+1)/W;
        for(int i=K-2;i>=0;i--)
            dp[i]=dp[i+1]+(dp[i+1]-dp[i+W+1])/W;
        return dp[0];
    }

}
