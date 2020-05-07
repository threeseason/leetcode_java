import java.util.PriorityQueue;


//在未排序的数组中找到第 k 个最大的元素。
//请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
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
