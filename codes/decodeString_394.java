//给定一个经过编码的字符串，返回它解码后的字符串。
//
//编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
//
//你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
//
//此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。


class Solution {
    public String decodeString(String s) {
        return helper(s,0,s.length()-1);
    }
    private String helper(String s,int index1,int index2){
        if(index1==index2)
            return s.substring(index1,index2+1);
        if(index1>index2)
        	return "";
        int j=index1;
        boolean brack=false;
        while(j<=index2&&Character.isDigit(s.charAt(j)))j++;
        int start=j;
        if(s.charAt(start)=='['){
        	brack=true;
        	start++;
        }
        System.out.println("start="+start);
        int num=j==index1?1:Integer.valueOf(s.substring(index1,j));
        System.out.println("num="+num);
        if(num==1){
            while(j<=index2&&!Character.isDigit(s.charAt(j)))j++;
            return s.substring(start,s.charAt(j-1)==']'?j-1:j)+helper(s,j,index2);
        }
        String res="";
        if(brack){
        	int count=0;
            do{
                if(s.charAt(j)=='[')
                    count++;
                else if(s.charAt(j)==']')
                    count--;
                j++;
            }while(j<=index2&&count!=0);
        }
        else{
        	while(!Character.isDigit(s.charAt(j)))j++;
        }
        for(int k=0;k<num;k++){
        	res+=helper(s,start,brack?j-2:j-1);
        }
        res+=helper(s,j,index2);
        return res;
    }
}
public class decodeString_394 {

	public static void main(String[] args) {
		Solution obj = new Solution();
		//String s="3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
		String s= "3[a]2[bc]";
		System.out.println(obj.decodeString(s));
	}

}
