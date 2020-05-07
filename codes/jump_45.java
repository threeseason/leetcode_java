
//给定一个非负整数数组，你最初位于数组的第一个位置。
//
//数组中的每个元素代表你在该位置可以跳跃的最大长度。
//
//你的目标是使用最少的跳跃次数到达数组的最后一个位置。
//

public class jump_45 {

	public static void main(String[] args) {
		int[] nums={0};
		System.out.println(jump(nums));
	}
	public static int jump(int[] nums) {
		if(nums.length==1||nums.length==0)
            return 0;
        int[] dp=new int[nums.length+1];
        dp[1]=nums[0];
        int start=0;
        int i=1;
        int max_dis=0;
        while(dp[i]<nums.length-1){
        	System.out.println("i="+i+"dp="+dp[i]);
            max_dis=dp[i];
            for(int j=start+1;j<=dp[i];j++){ 
                if(max_dis<nums[j]+j){
                    max_dis=nums[j]+j;
                    start=j;
                    dp[i+1]=max_dis;
                }
                System.out.println("j="+j+"max="+max_dis);
            }
            i++;
        }
        return i;
    }

}
