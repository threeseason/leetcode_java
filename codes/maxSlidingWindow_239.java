
public class maxSlidingWindow_239 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k=3;
		int[] res=maxSlidingWindow(nums,k);
		for(int i:res)
			System.out.print(i);
	}
	public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res=new int[nums.length-k+1];
        int max=nums[0];
        for(int i=0;i<k;i++)
            max=max>nums[i]?max:nums[i];
        res[0]=max;
        for(int i=1;i<nums.length-k+1;i++){
            if(nums[i-1]==res[i-1]){
                max=nums[i];
                for(int j=i;j<i+k;j++)
                    max=max>nums[j]?max:nums[j];
                res[i]=max;
            }
            else
                res[i]=res[i-1]>nums[i+k-1]?res[i-1]:nums[i+k-1];
        }
        return res;
    }
}
