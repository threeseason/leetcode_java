class findTargetSumWays {
    public int main(int[] nums, int S) {
        int[][] dp = new int[nums.length][2001];
        dp[0][1000+nums[0]]=1;
        dp[0][1000-nums[0]]=1;
        for(int i=1;i<nums.length;i++)
            for(int j=-1000;j<=1000;j++){
            	dp[i][j+1000]=(j-nums[i]+1000<0?0:dp[i-1][j-nums[i]+1000])+(j+nums[i]+1000>2000?0:dp[i-1][j+nums[i]+1000]);
            }
        return S>1000?0:dp[nums.length-1][S+1000];
    }
}
public class findTargetSumWays_494 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={1, 1, 1, 1, 1};
		int S=3;
		findTargetSumWays obj= new findTargetSumWays();
		System.out.println(obj.main(nums, S));
	}

}
