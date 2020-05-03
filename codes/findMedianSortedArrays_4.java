
public class findMedianSortedArrays_4 {

	public static void main(String[] args) {
		int[] nums1={1};
		int[] nums2={2,3,4};
		System.out.println(findMedianSortedArrays(nums1,nums2));

	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        
        if(m==0)
            return n%2==0?(float)(nums2[n/2]+nums2[n/2-1])/2:nums2[n/2];
        if(n==0)
            return m%2==0?(float)(nums1[m/2]+nums1[m/2-1])/2:nums1[m/2];
        if(m>n)
            return findMedianSortedArrays(nums2,nums1);
        int left=0;
        int right=m-1;
        while(left<=right){
            int i=(left+right)/2;
            int j=(m+n)/2-i;
            System.out.println("i="+i+"j="+j);
            if(i==0){
            	if(j>=n){
            		if(nums1[i]<nums2[j-1])
                        left=i+1;
                    else
                    	return (float)(nums2[j-1]+nums1[i])/2;
            	}       
            	else if(nums2[j-1]<=nums1[i])
            		return (m+n)%2==0?(float)(nums2[j-1]+(nums1[i]<nums2[j]?nums1[i]:nums2[j]))/2:nums1[i]<nums2[j]?nums1[i]:nums2[j];
            	else
            		left=i+1;
            }
              
            else if(j==0)
                return (m+n)%2==0?(float)(nums1[i-1]+(nums1[i]<nums2[j]?nums1[i]:nums2[j]))/2:nums1[i]<nums2[j]?nums1[i]:nums2[j];
            else if(nums1[i-1]<=nums2[j]&&nums2[j-1]<=nums1[i]){
            	System.out.println("i="+i+"j="+j);
            	return (m+n)%2==0?(float)((nums1[i-1]>nums2[j-1]?nums1[i-1]:nums2[j-1])+(nums1[i]<nums2[j]?nums1[i]:nums2[j]))/2:nums1[i]<nums2[j]?nums1[i]:nums2[j];
                
            }
                 else if(nums1[i-1]>nums2[j])
                right=i-1;
            else if(nums1[i]<nums2[j-1]){
            	System.out.println("duandian1");
            	 left=i+1;
            }
               
        }
        int i=left;
        int j=(m+n)/2-i;
        System.out.println("duandian2");
        if(j!=0){
        	if(i!=m)
        		return (m+n)%2==0?(float)((nums1[i-1]>nums2[j-1]?nums1[i-1]:nums2[j-1])+nums1[i]<nums2[j]?nums1[i]:nums2[j])/2:nums1[i]<nums2[j]?nums1[i]:nums2[j];
        	else
        		return (m+n)%2==0?(float)((nums1[i-1]>nums2[j-1]?nums1[i-1]:nums2[j-1])+nums2[j])/2:nums2[j];
        }
        else{
        	if(i!=m)
        		return (m+n)%2==0?(float)(nums1[i]<nums2[j]?nums1[i]:nums2[j]+nums1[i-1])/2:nums2[j];
        	else
        		return (m+n)%2==0?(float)(nums1[i-1]+nums2[j])/2:nums2[j];
        }
        	
	}
}
