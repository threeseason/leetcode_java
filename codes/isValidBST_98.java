
//����һ�����������ж����Ƿ���һ����Ч�Ķ�����������
//
//����һ��������������������������
//
//�ڵ��������ֻ����С�ڵ�ǰ�ڵ������
//�ڵ��������ֻ�������ڵ�ǰ�ڵ������
//�������������������������Ҳ�Ƕ�����������


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
