//请实现一个函数用来匹配包含'. '和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（含0次）。
//在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但与"aa.a"和"ab*a"均不匹配。


class isMatch {
    public boolean main(String s, String p) {
        int[][] memo= new int[s.length()+1][p.length()+1];
        return helper(memo,s,p,0,0);
    }
    private boolean helper(int[][] memo,String s,String p,int ss,int sp){
    	System.out.println(ss+","+sp);
        if(sp>=p.length())
            return ss>=s.length();
        if(ss<s.length()&&sp<p.length()&&memo[ss][sp]!=0)
            return memo[ss][sp]==1;
        boolean first=ss<s.length()&&(s.charAt(ss)==p.charAt(sp)||p.charAt(sp)=='.');
        if(sp<p.length()-1&&p.charAt(sp+1)=='*'){
            boolean ans=(first&&helper(memo,s,p,ss+1,sp))||helper(memo,s,p,ss,sp+2);
            memo[ss][sp]=ans?1:2;
            return ans;
        }
        boolean ans=first&&helper(memo,s,p,ss+1,sp+1);
        memo[ss][sp]=ans?1:2;
        return ans;
    }
}
public class isMatch_m19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isMatch obj=new isMatch();
		String s="aa";
		String p="a*";
		System.out.println(obj.main(s, p));
	}

}
