import java.util.Stack;

//输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
//假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。


//模拟出入栈
public class validateStackSequences_31 {

	public static void main(String[] args) {
		int[] pushed = {1,0}, popped = {1,0};
		System.out.println(validateStackSequences(pushed,popped));

	}
	public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length!=popped.length)
            return false;
        if(popped.length==0)
            return true;
        Stack<Integer> s = new Stack<>();
        int k=0;
        for(int i:pushed){
            s.add(i);
            while(k<popped.length&&!s.isEmpty()&&s.peek()==popped[k]){
                System.out.println(s.pop());
                k++;
            }
        }
        return s.isEmpty();
    }
}
