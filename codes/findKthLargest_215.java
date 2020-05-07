import java.util.PriorityQueue;


//��δ������������ҵ��� k ������Ԫ�ء�
//��ע�⣬����Ҫ�ҵ������������ĵ� k ������Ԫ�أ������ǵ� k ����ͬ��Ԫ�ء�
public class findKthLargest_215 {

	public static void main(String[] args) {
		int[] nums={3,2,3,1,2,4,5,5,6};
		int k=4;
		System.out.println(findKthLargest(nums,k));
		
	}
	 public static int findKthLargest(int[] nums, int k) {
	        PriorityQueue<Integer> heap=new PriorityQueue<>();
	        for(int i:nums){
	            heap.add(i);
	            if(heap.size()>k)
	                heap.poll();
	        }
	        return heap.peek();
	    }

}
