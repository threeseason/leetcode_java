
public class singleNumber_m56 {

	//��һ������ nums �г�һ������ֻ����һ��֮�⣬�������ֶ����������Ρ����ҳ��Ǹ�ֻ����һ�ε����֡�
	
	//���ڳ������ε�������������Ƹ�λ��3ȡģ��Ϊ0
	//ʹ��one��two��Ϊ״̬����ÿ����3�͹���
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
