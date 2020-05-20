
public class verifyPostorder_33 {

	public static void main(String[] args) {
		int[] a={1,3,2,6,5};
		System.out.println(verifyPostorder(a));

	}
	 public static boolean verifyPostorder(int[] postorder) {
	        return helper(postorder,0,postorder.length-1);
	    }
	    private static boolean helper(int[] postorder,int left,int right){
	        if(left>=right)
	            return true;
	        int i=left;
	        while(postorder[i]<postorder[right])
	            i++;
	        System.out.println(i);
	        int num_right=right-i;
	        int temp=i;
	        while(num_right>0){
	            if(postorder[++temp]<postorder[right])
	                return false;
	            num_right--;
	        }
	        return helper(postorder,left,i-1)&&helper(postorder,i,right-1);
	    }

}
