
//实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
//
//如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
//
//必须原地修改，只允许使用额外常数空间。
//
//以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
//1,2,3 → 1,3,2
//3,2,1 → 1,2,3
//1,1,5 → 1,5,1


public class nextPermutation_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,1,3,3};
		nextPermutation(a);
		for(int i:a)
			System.out.print(i);
	}
	public static void nextPermutation(int[] nums) {
        int min=Integer.MAX_VALUE;
        int p=nums.length-1;
        boolean flag=true;
        for(int i=nums.length-1;i>0;i--){
        	if(nums[i-1]<nums[i]){
                for(int k=nums.length-1;k>=i;k--){
                    if(min>nums[k]&&nums[k]>nums[i-1]){
                        min=nums[k];
                        p=k;
                    }
                }
                flag=false;
                int temp=nums[p];
                nums[p]=nums[i-1];
                nums[i-1]=temp;
                for(int n:nums)
                	System.out.print(n);
                System.out.println("=========");
                so(nums,i,nums.length-1);
                for(int n:nums)
                	System.out.print(n);
                System.out.println("=========");
                break;
            }
        }
        if(flag)
            so(nums,0,nums.length-1);

    }
	//因为右侧确定是降序，所以只需要进行reverse不需要sort
    private static void so(int[] nums,int left,int right){

    	while(left<right){
            int temp=nums[right];
            nums[right]=nums[left];
            nums[left]=temp;
            left++;
            right--;
        }          
    }

}
