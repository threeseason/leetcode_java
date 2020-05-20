import java.util.LinkedList;
import java.util.List;

public class generateTrees_95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=81;
//		if(n<2)
//            return n;
        double[] f = new double[n+1];
        f[0]=0;
        f[1]=1;
        for(int i=2;i<=n;i++)
            f[i]=f[i-1]+f[i-2];
		
		System.out.println(Integer.MIN_VALUE);
	}
	public static List<TreeNode> generateTrees(int n) {
        if(n==0)
            return new LinkedList<TreeNode>();
        return helper(1,n);
    }
    private static LinkedList<TreeNode> helper(int start,int end){
        LinkedList<TreeNode> trees=new LinkedList<>();
        if(start>end){
            trees.add(null);
            return trees;
        }
        for(int i=start;i<=end;i++){
            LinkedList<TreeNode> left_trees=helper(start,i-1);
            LinkedList<TreeNode> right_trees=helper(i+1,end);
            for(TreeNode l:left_trees)
                for(TreeNode r:right_trees)
                {
                    TreeNode t= new TreeNode(i);
                    t.left=l;
                    t.right=r;
                    trees.add(t);
                }
        }
        return trees;
    } 
}
