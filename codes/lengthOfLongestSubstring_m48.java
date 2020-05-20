
public class lengthOfLongestSubstring_m48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}
	public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s.length()==1)
            return s.length();
        int[] dp=new int[s.length()];
        int max=1;
        dp[0]=1;
        for(int i=1;i<s.length();i++){
            int start=i-dp[i-1];
            int index=s.substring(start,i).indexOf(s.charAt(i));
            dp[i]=index==-1?dp[i-1]+1:dp[i-1]-index;
            max=max>dp[i]?max:dp[i];
        }
        return max;
    }

}
