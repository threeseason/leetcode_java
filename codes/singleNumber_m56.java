
public class singleNumber_m56 {

	//在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
	
	//对于出现三次的数，则其二进制各位对3取模则为0
	//使用one和two作为状态机，每当到3就归零
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={3,3,4,3};
		System.out.println(singleNumber(nums));
	}
	public static int singleNumber(int[] nums){
		int one = 0;
		int two = 0;
		for(int i:nums){
			one = one^i&~two;
			two = two^i&~one;
		}
		return one;
		
	}

}
