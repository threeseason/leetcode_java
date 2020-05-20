import java.util.HashMap;
import java.util.Map;

//给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。
public class subarraySum_560 {

	public static void main(String[] args) {
		int[] nums={0,0,0,0,0,0,0,0,0,0};
		int k=0;
		System.out.println(subarraySum2(nums, k));

	}
	//时间O(N^2) 空间O(1)
	 public static int subarraySum(int[] nums, int k) {
	        if(nums.length==1)
	            return nums[0]==k?1:0;
	        int res=0;
	        int count=0;
	        for(int i=0;i<nums.length;i++){
	            count =0;
	            for(int j=i;j<nums.length;j++){
	                count+=nums[j];
	                if(count==k){
	                    res++;
	                    
	                }
	            }
	        }
	        return res;
	    }
	 //时间O(N) 空间O(N)
	 public static int subarraySum2(int[] nums, int k) {
	        if(nums.length==1)
	            return nums[0]==k?1:0;
	        Map<Integer,Integer> m = new HashMap<>();
	        m.put(0,1);
	        int res=0;
	        int pre=0;
	        for(int i=0;i<nums.length;i++){
	            pre+=nums[i];
	            if(m.containsKey(pre-k))
	                res+=m.get(pre-k);
	            m.put(pre,m.getOrDefault(pre,0)+1);
	        }
	        return res;
	    }

}
