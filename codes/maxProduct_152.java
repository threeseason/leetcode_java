

//����һ���������� nums �������ҳ������г˻��������������飨�������������ٰ���һ�����֣��������ظ�����������Ӧ�ĳ˻���

//��Ҫ������������ά������Ϊiֻ��i-1�йأ�Ҳ���Բ�������
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
