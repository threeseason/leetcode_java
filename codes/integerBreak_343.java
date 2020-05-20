
public class integerBreak_343 {

	public static void main(String[] args) {
		int n=10;
		System.out.println(integerBreak(n));

	}
	public static int integerBreak(int n) {
        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=1;
        if(n==2)
            return 1;
        for(int i=2;i<=n;i++){
        	for(int j=1;j<i;j++)
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),dp[i-j]*j));
        		//dp[i]=Math.max(dp[i],j*(i-j));//i-j不一定大于dp[i-j]
        	System.out.println("i="+i+"=>"+dp[i]);
        }
        return dp[n];
    }

}
