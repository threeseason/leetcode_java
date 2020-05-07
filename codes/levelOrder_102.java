import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。
//（即逐层地，从左到右访问所有节点）。

public class levelOrder_102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Integer[] temp=new Integer[q.size()];
            int sz=q.size();
            for(int i=0;i<sz;i++){
                TreeNode t=q.poll();
                temp[i]=t.val;
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
            }
            res.add(Arrays.asList(temp));
        }
        return res;
    }

}
