
//дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ�� ��+������-������*������/�� ����������š�

//s=a+b��ת��Ϊs=n+c������nΪ�������cΪ��λ��ѭ��ֱ��cΪ����nΪ���
public class add_m65 {

	public static void main(String[] args) {
		int a=-10,b=5;
		System.out.println(add(a,b));

	}
	 public static int add(int a, int b) {
	        if(b==0)
	            return a;
	        int c=(a&b)<<1;
	        int n=a^b;
	        return add(n,c);
	    }

}
