import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={0,0,0,0};
			
		int target=0;
		System.out.println(fourSum(nums,target));
	}
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int need=target-nums[i]-nums[j];
                System.out.println("i="+i+"j="+j+"need="+need);
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    if(nums[k]+nums[l]==need){
                        res.add(Arrays.asList(new Integer[] {nums[i],nums[j],nums[k],nums[l]}));
                        System.out.println("check");
                        while(k<l&&nums[k+1]==nums[k])k++;
                        while(k<l&&nums[l-1]==nums[l])l--;
                        k++;
                        l--;
                    }
                    else if(nums[k]+nums[l]>need)
                    {
                    	l--;
                    	System.out.println(">");
                    }
              
                    else{
                    	k++;
                    	System.out.println("<");
                    }
                        
                }
                while(j<nums.length-2&&nums[j+1]==nums[j])j++;
            }
            while(i<nums.length-3&&nums[i+1]==nums[i])i++;
        }
        return res;
    }
}
