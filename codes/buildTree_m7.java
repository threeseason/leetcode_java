import java.util.HashMap;
import java.util.Map;

public class buildTree_m7 {
	static int[] pre;
    static int[] in;
    static Map<Integer,Integer> m;
	public static void main(String[] args) {
		int[] preorder = {3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		System.out.println(buildTree(preorder,inorder).val);
	}
	public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0)
            return null;
        pre=preorder;
        in = inorder;
        m=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
            m.put(inorder[i],i);
        return helper(0,pre.length-1,0,in.length-1);
    }
    private static TreeNode helper(int pre_start,int pre_end,int in_start,int in_end){
        if(in_start==in_end)
            return new TreeNode(in[in_start]);
        if(in_start>in_end)
            return null;
        int val=pre[pre_start];
        TreeNode t= new TreeNode(val);
        int index=m.get(val);
        int num_left=index-in_start;
        int num_right=in_end-index;
        t.left=helper(pre_start+1,pre_start+num_left,index-num_left,index-1);
        t.right=helper(pre_end-num_right+1,pre_end,index+1,in_end);
        return t;
    }

}
