
public class lowestCommonAncestor_236 {
	TreeNode ans;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       ans=null;
       helper(root,p,q);
       return ans;
    }
    private boolean helper(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)
            return false;
        boolean lson = helper(root.left,p,q);
        boolean rson = helper(root.right,p,q) ;
        if(lson&&rson||((root==p||root==q)&&(lson||rson)))
            ans=root;
        return lson||rson||root==p||root==q;
    }

}
