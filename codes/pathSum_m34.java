import java.util.ArrayList;
import java.util.List;
//����һ�ö�������һ����������ӡ���������нڵ�ֵ�ĺ�Ϊ��������������·����
//�����ĸ��ڵ㿪ʼ����һֱ��Ҷ�ڵ��������Ľڵ��γ�һ��·����


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
            res.add(new ArrayList(l));//ֱ��ADDl�Ļ�����l�ı��Ӱ��res�е�ֵ
           
        }
        helper(root.left,target-root.val);
        helper(root.right,target-root.val);
        l.remove(l.size()-1);
    }

}
