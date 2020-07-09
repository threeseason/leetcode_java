//在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
//输入一个数组，求出这个数组中的逆序对的总数。

//使用排序，排序时出现逆序对则累加，这里使用时间复杂度为nlogn的归并排序
class reversePairs {
    public int main(int[] nums) {
        if(nums.length<2)
            return 0;
        int[] temp=new int[nums.length];
        int[] copy=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            copy[i]=nums[i];
        return distach(copy,0,nums.length-1,temp);
    }
    private int distach(int[] nums,int left,int right,int[] temp){
        if(left==right)return 0;
        int mid=left+(right-left)/2;
        int left_num=distach(nums,left,mid,temp);
        int right_num=distach(nums,mid+1,right,temp);
        if(nums[mid]<=nums[mid+1])
            return left_num+right_num;
        int count=merge(nums,left,mid,right,temp);
        for(int num:nums)
        	System.out.print(num);
        System.out.println();
        return left_num+right_num+count;
    }
    private int merge(int[] nums,int left,int mid,int right,int[] temp){
        for(int k=left;k<=right;k++)
            temp[k]=nums[k];
        int i=left;
        int j=mid+1;
        int count=0;
        System.out.println("left="+left+"mid="+mid+"right="+right);
        for(int k=left;k<=right;k++){
            if(i==mid+1){
                nums[k]=temp[j++];
            }else if(j==right+1){
                nums[k]=temp[i++];
            }else if(temp[i]<=temp[j]){
                nums[k]=temp[i++];
            }else{
                System.out.println(temp[j]+"比"+temp[i]+"小,count="+(mid-i+1));
                nums[k]=temp[j++];
                System.out.println();
                count+=(mid-i+1);
            }
        }
        
        return count;
    }
}
public class reversePairs_m51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversePairs obj=new reversePairs();
		int[] nums={7,5,6,4};
		System.out.println(obj.main(nums));
	}

}
