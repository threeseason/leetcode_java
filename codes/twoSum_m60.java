
//把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率。
//你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。

//也可以用动态规划dp[n][j]表示投完n枚骰子的总数j的次数
public class twoSum_m60 {
	static double[][] dp;
	public static void main(String[] args) {
		int n=3;
		double[] res=twoSum(n);
		for(double i:res)
			System.out.println(i);
//		int n=2;
//		dp=new double[n+1][6*n+1];
//		System.out.println(helper(2,2));
	}

    public static double[] twoSum(int n) {
        dp=new double[n+1][6*n+1];
        double[] res=new double[5*n+1];
        for(int i=0;i<5*n+1;i++){
        	res[i]=helper(n,i+n);
        	//System.out.println("i="+i+"res="+res[i]);
        }
            
        return res;
    }
    private static double helper(int n,int sum){
        if(dp[n][sum]!=0){
        	System.out.println("usedp");
        	return dp[n][sum];
        }
            
        if(n==1)
            return 1.0/6.0;
        double[] temp=new double[7];
        double count=0;
        int min=n-1;
        int max=(n-1)*6;
        for(int i=1;i<=6;i++)
            if(sum-i>=min&&sum-i<=max){
            	temp[i]=1.0/6.0*helper(n-1,sum-i);
            	//System.out.println("i=="+i+"to"+helper(n-1,sum-i));
            }
        for(double i:temp)
        	count+=i;
        //System.out.println("temp="+temp);
        dp[n][sum]=count;
        return count;
    }

}
