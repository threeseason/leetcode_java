import java.util.LinkedList;
import java.util.Queue;


//输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
//
//B是A的子结构， 即 A中有出现和B相同的结构和节点值。
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
