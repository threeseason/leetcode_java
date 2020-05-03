//给定两个字符串 s 和 t，判断它们是否是同构的。
//
//如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
//
//所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。


public class isIsomorphic_205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abb";
		String t="egg";
		System.out.println(isIsomorphic(s,t));

	}
	public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] S= new int[128];
        int[] T= new int[128];
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(S[c1]!=T[c2])
                return false;
            else{
                if(S[c1]==0){
                    S[c1]=i+1;
                    T[c2]=i+1;
                }
            }
        }
        return true;
    }

}
