

class oneEditAway {
    public boolean main(String first, String second) {
        if(first.length()==0&&second.length()==0)return true;
        if(Math.abs(first.length()-second.length())>1)return false;
        int[][] dp=new int[first.length()+1][second.length()+1];
        for(int i=0;i<=first.length();i++)dp[i][0]=i;
        for(int j=0;j<=second.length();j++)dp[0][j]=j;
        for(int i=1;i<=first.length();i++)
            for(int j=1;j<=second.length();j++){
                    if(first.charAt(i-1)==second.charAt(j-1))
                        dp[i][j]=Math.min(Math.min(dp[i-1][j]+1,dp[i][j-1]+1),dp[i-1][j-1]);
                    else
                        dp[i][j]=Math.min(Math.min(dp[i-1][j]+1,dp[i][j-1]+1),dp[i-1][j-1]+1);
                }
        return dp[first.length()][second.length()]<=1;
    }
}
public class oneEditAway_m0105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solution obj = new Solution();
		oneEditAway obj = new oneEditAway();
		String first = "horse";
				
		String second = "ros";
		System.out.println(obj.main(first, second));
	}

}
