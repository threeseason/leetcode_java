

//给你一个整数数组 nums ，请你找出数组中乘积最大的连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。

//需要用两个数组来维护，因为i只与i-1有关，也可以不用数组
public class maxProduct_152 {

	public static void main(String[] args) {
		int[] nums={0,2};
		System.out.println(maxProduct(nums));

	}
	 public static int maxProduct(int[] nums) {
	        if(nums.length==1)
	            return nums[0];
	        int[] max=new int[nums.length];
	        int[] min=new int[nums.length];
	        max[0]=nums[0];
	        min[0]=nums[0];
	        int res=max[0];
	        for(int i=1;i<nums.length;i++){
	        	 max[i]=Math.max(Math.max(max[i-1]*nums[i],min[i-1]*nums[i]),nums[i]);
	             min[i]=Math.min(Math.min(max[i-1]*nums[i],min[i-1]*nums[i]),nums[i]);
	             res=res>max[i]?res:max[i];
	        }
	        return res;
	    }

}
