

//����һ�����֣����ǰ������¹����������Ϊ�ַ�����0 ����� ��a�� ��1 ����� ��b����������11 ����� ��l����������25 ����� ��z����
//һ�����ֿ����ж�����롣����ʵ��һ����������������һ�������ж����ֲ�ͬ�ķ��뷽����

//ʹ�ö�̬�滮���� 
public class translateNum_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12;
		System.out.println(translateNum(num));
	}
	 public static int translateNum(int num) {
	        String s = String.valueOf(num);
	        int[] dp=new int[s.length()];
	        if(s.length()==1)
	        	return 1;
	        dp[0]=1;
	        dp[1]=Integer.valueOf(s.substring(0,2))>9&&Integer.valueOf(s.substring(0,2))<=25?2:1;
	        for(int i=2;i<s.length();i++){
	        	if(Integer.valueOf(s.substring(i-1,i+1))<=25&&Integer.valueOf(s.substring(i-1,i+1))>9)
	        		dp[i]=dp[i-1]+dp[i-2];
	        	else
	        		dp[i]=dp[i-1];
	        	//System.out.println("dp["+i+"]="+dp[i]+",c["+i+"]="+c[i]);
	        }
	        return dp[s.length()-1];
	}

}
