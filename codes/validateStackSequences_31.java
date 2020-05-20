import java.util.Stack;

//���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
//����ѹ��ջ���������־�����ȡ����磬���� {1,2,3,4,5} ��ĳջ��ѹջ���У����� {4,5,3,2,1} �Ǹ�ѹջ���ж�Ӧ��һ���������У��� {4,3,5,1,2} �Ͳ������Ǹ�ѹջ���еĵ������С�


//ģ�����ջ
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
