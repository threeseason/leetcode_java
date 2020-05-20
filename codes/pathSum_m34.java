import java.util.ArrayList;
import java.util.List;
//输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。
//从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。


public class pathSum_m34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	List<List<Integer>> res;
    List<Integer> l;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        res=new ArrayList<>();
        l = new ArrayList<>();
        helper(root,sum);
        return res;
    }
    private void helper(TreeNode root,int target){
        if(root==null){
            return;
        }
        l.add(root.val);
        if(root.left==null&&root.right==null&&target==root.val){
            res.add(new ArrayList(l));//直接ADDl的话后面l改变会影响res中的值
           
        }
        helper(root.left,target-root.val);
        helper(root.right,target-root.val);
        l.remove(l.size()-1);
    }

}
