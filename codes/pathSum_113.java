import java.util.ArrayList;
import java.util.List;
//����һ����������һ��Ŀ��ͣ��ҵ����дӸ��ڵ㵽Ҷ�ӽڵ�·���ܺ͵��ڸ���Ŀ��͵�·����
//
//˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
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
          //path.remove((Integer)root.left.val);  ���ڵ�ֵ����Ψһ��
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
