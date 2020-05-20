

//给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
//一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。

//使用动态规划方法 
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
