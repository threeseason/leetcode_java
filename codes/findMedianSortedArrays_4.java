
public class findMedianSortedArrays_4 {

	public static void main(String[] args) {
		int[] nums1={1,2,3};
		int[] nums2={4,5,6};
		System.out.println(findMedianSortedArrays(nums1,nums2));

	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length)
            return findMedianSortedArrays(nums2,nums1);
        int m=nums1.length;
        int n=nums2.length;
        if(m==0)
        	return n%2==0?(nums2[n/2]+nums2[n/2-1])/2.0:(double)nums2[n/2];
        if(n==0)
        	return m%2==0?(nums1[m/2]+nums1[m/2-1])/2.0:(double)nums1[m/2];
        int left=0,right=m-1;
        while(left<=right){
            int i=(left+right)/2;
            int j=(m+n-1)/2-i;
                //if((j==n-1?true:nums1[i]<=nums2[j+1])&&(i==m-1?true:nums2[j]<=nums1[i+1])){
            	if(((i==0||j==n-1)?true:nums1[i-1]<=nums2[j+1])&&nums1[i]>=nums2[j]){
                    int left_max;
                    int right_min;
                    if(i==0)left_max=nums2[j];
                    else
                    	left_max=nums1[i-1]>nums2[j]?nums1[i-1]:nums2[j];
                    if(j==n-1)right_min=nums1[i];
                    else
                    	right_min=nums1[i]<nums2[j+1]?nums1[i]:nums2[j+1];
                    return (m+n)%2==0?(left_max+right_min)/2.0:left_max;
                }
            	System.out.println("i="+i+"j="+j+"nums1="+nums1[i]+"nums2="+nums2[j]);
            	if(nums1[i]<nums2[j])
                    left=i+1;
            	else if(nums1[i-1]>nums2[j+1])
                    right=i;
                
        }
        System.out.println("left:"+left+"right"+right);
        int i=left;
        int j=(m+n-1)/2-i;
        int left_max;
        int right_min;
        if(i==0)left_max=nums2[j];
        else
        	left_max=j==-1?nums1[i-1]:(nums1[i-1]>nums2[j]?nums1[i-1]:nums2[j]);
        if(j==n-1)right_min=nums1[i];
        else
        	right_min=(i==m?nums2[j+1]:(nums1[i]<nums2[j+1]?nums1[i]:nums2[j+1]));
		System.out.println("left_max:"+left_max+"right_min:"+right_min);
		System.out.println("i="+i+"j="+j);
		System.out.println("1*");
        return (m+n)%2==0?(left_max+right_min)/2.0:left_max/1.0;
    }
}
