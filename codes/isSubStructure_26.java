import java.util.LinkedList;
import java.util.Queue;


//�������ö�����A��B���ж�B�ǲ���A���ӽṹ��(Լ��������������һ�������ӽṹ)
//
//B��A���ӽṹ�� �� A���г��ֺ�B��ͬ�Ľṹ�ͽڵ�ֵ��
public class isSubStructure_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null)
            return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            if(check(t,B))
                return true;
            if(t.left!=null)
                q.add(t.left);
            if(t.right!=null)
                q.add(t.right);
        }
        return false;
    }
    private boolean check(TreeNode t,TreeNode b){
        if(b==null)
            return true;
        if(t==null)
            return false;
        if(t.val!=b.val)
            return false;
        return check(t.left,b.left)&&check(t.right,b.right);
    }

}
