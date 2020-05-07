import java.util.Arrays;


//给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
//找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。


public class threeSumClosest_16 {

	public static void main(String[] args) {
		int[] nums={-1,2,1,-4};
		int target=1;
		System.out.println(threeSumClosest(nums,target));

	}
	public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=0;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int need=target-nums[i];
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(diff>Math.abs(need-nums[j]-nums[k])){
                    diff=Math.abs(need-nums[j]-nums[k]);
                    res=nums[i]+nums[j]+nums[k];
                }
                if(nums[j]+nums[k]>need)
                    k--;
                else
                    j++;
            }
            
        }
        return res;
    }
}
