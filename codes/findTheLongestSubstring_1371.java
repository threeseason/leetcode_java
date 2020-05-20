import java.util.Arrays;

//给你一个字符串 s ，请你返回满足以下条件的最长子字符串的长度：每个元音字母，即 'a'，'e'，'i'，'o'，'u' ，在子字符串中都恰好出现了偶数次。


//status压缩每个字母出现的奇偶性，pos来记录奇偶性
public class findTheLongestSubstring_1371 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcodeisgreat";
		System.out.println(findTheLongestSubstring(s));
	}
	public static int findTheLongestSubstring(String s) {
        int status=0,res=0;
        int[] pos=new int[1<<5];
        Arrays.fill(pos,-1);
        pos[0]=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            switch(c){
                case 'a':
                    status^=1;
                    break;
                case 'e':
                    status^=1<<1;
                    break;
                case 'i':
                    status^=1<<2;
                    break;
                case 'o':
                    status^=1<<3;
                    break;
                case 'u':
                    status^=1<<4;
                    break;
            }
            if(pos[status]>=0)
                res=res>i+1-pos[status]?res:i+1-pos[status];
            else
                pos[status]=i+1;
            System.out.println("i="+i+"res="+res+"status="+status);
        }
        return res;
    }

}
