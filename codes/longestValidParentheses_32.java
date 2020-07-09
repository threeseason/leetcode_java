import java.util.Stack;

//����һ��ֻ���� '(' �� ')' ���ַ������ҳ���İ�����Ч���ŵ��Ӵ��ĳ��ȡ�
class longestValidParentheses {
    public int main(String s) {
        Stack<Integer> st=new Stack<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.add(i);
            }
            else{
            	
            	if(st.isEmpty())
            		st.add(-i-1);
            	else if(st.peek()>=0){
            		int count=0;
                    st.pop();
                    if(st.isEmpty())
                        count=i+1;
                    else
                    	count=i-(st.peek()>=0?st.peek():-st.peek()-1);
                    res=Math.max(res, count);
                }
                else{
                    st.add(-i-1);
                }
            }
        }
        return res;
    }
}
public class longestValidParentheses_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestValidParentheses obj=new longestValidParentheses();
		String s="()(()";
		System.out.println(obj.main(s));
	}

}
