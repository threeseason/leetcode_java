import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
//
//注意：答案中不可以包含重复的三元组。
//

public class threeSum_15 {

	public static void main(String[] args) {
		int[] nums={-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));

	}
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        nums=sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0)
                return res;
            int target=0-nums[i];
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==target){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k&&nums[j]==nums[j+1])//去重
                        j++;
                    while(j<k&&nums[k]==nums[k-1])//去重
                        k--;
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k]<target)
                    j++;
                else
                    k--;
            }
            while(i<nums.length-2&&nums[i]==nums[i+1])
                i++;
        }
        return res;
    }
    private static int[] sort(int[] nums){
        for(int i=1;i<nums.length;i++){
            int j=i;
            while(j>0&&nums[j]<nums[j-1])
            {
                int temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
                j--;
            }
        }
        return nums;
    }

}
