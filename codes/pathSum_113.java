import java.util.ArrayList;
import java.util.List;
//给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
//
//说明: 叶子节点是指没有子节点的节点。
class pathSum {
    List<List<Integer>> res;
    public List<List<Integer>> main(TreeNode root, int sum) {
        res=new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if(root==null)return res;
        path.add(root.val);
        helper(root,path,sum-root.val);
        return res;
    }
    private void helper(TreeNode root,List<Integer> path,int sum){
        if(root.left==null&&root.right==null){
            if(sum==0)
                res.add(new ArrayList<>(path));
            return;
        }
        if(root.left!=null){
            path.add(root.left.val);
            helper(root.left,path,sum-root.left.val);
          //path.remove((Integer)root.left.val);  各节点值不是唯一的
            path.remove(path.size()-1);
        }
        if(root.right!=null){
            path.add(root.right.val);
            helper(root.right,path,sum-root.right.val);
           // path.remove((Integer)root.right.val);
            path.remove(path.size()-1);
        }
    }
}
public class pathSum_113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
