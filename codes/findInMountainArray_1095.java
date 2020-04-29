
//https://leetcode-cn.com/problems/find-in-mountain-array
//给你一个 山脉数组 mountainArr，请你返回能够使得 mountainArr.get(index) 等于 target 最小 的下标 index 值。
//
//如果不存在这样的下标 index，就请返回 -1。

interface MountainArray {
      public  int get(int index);
      public int length();
  }
public class findInMountainArray_1095 {

	public static int main(int target, MountainArray mountainArr) {
		int peak=findMid(mountainArr);
        return getIndex(target,mountainArr,peak);

	}

    private static int findMid(MountainArray mountainArr){
        int left=0;
        int right=mountainArr.length()-1;
        while(left<right){
            int mid=(left+right)/2;
            int mid_value=mountainArr.get(mid);
            int mid1_value=mountainArr.get(mid+1);
            if(mid-1<0)
                if(mid_value>mid1_value)
                    return mid;
                if(mid_value<mid1_value){
                    left=mid+1;
                }
            else{
                int mid0_value=mountainArr.get(mid-1);
                if(mid_value>mid1_value&&mid_value>mid0_value)
                    return mid;
                else if(mid_value>mid0_value&&mid_value<mid1_value)
                    left=mid+1;
                else if(mid_value<mid0_value&&mid_value>mid1_value)
                    right=mid-1;
            }
        }
        return left;
    }
    private static int getIndex(int target,MountainArray mountainArr,int peak){
        int left=0;
        int right=peak;
        while(left<right){
            int mid=(left+right)/2;
            int mid_value=mountainArr.get(mid);
            if(mid_value==target)
                return mid;
            else if(mid_value>target)
                right=mid-1;
            else
                left=mid+1;
        }
        if(mountainArr.get(left)!=target){
            left=peak+1;
            right=mountainArr.length()-1;
            while(left<right){
                int mid=(left+right)/2;
                int mid_value=mountainArr.get(mid);
                if(mid_value==target)
                    return mid;
                else if(mid_value>target)
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        return mountainArr.get(left)==target?left:-1;
    }

}
