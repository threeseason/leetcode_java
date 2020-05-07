
//给定一个二叉树，判断其是否是一个有效的二叉搜索树。
//
//假设一个二叉搜索树具有如下特征：
//
//节点的左子树只包含小于当前节点的数。
//节点的右子树只包含大于当前节点的数。
//所有左子树和右子树自身必须也是二叉搜索树。


public class isValidBST_98 {
	Long value=Long.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

    public boolean isValidBST(TreeNode root) {
        return judge(root);
    }
    public boolean judge(TreeNode root){
        if(root==null)
            return true;
        if(!judge(root.left))
            return false;
        if(root.val<=value)
            return false;
        value=(long)root.val;
        return judge(root.right);
    }

}
