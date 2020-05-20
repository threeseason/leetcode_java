import java.util.ArrayList;
import java.util.List;

//输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
//
//序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。


//双指针法
//从左侧第一个为左指针i，第二个为右指针j，和为sum(i...j)
//指针只能右移
//和大于目标则移动左指针，小于则移动右指针，等于则加入答案集，同一个右指针的答案只能有一个，此时移动左指针
//左指针大于等于右指针终止循环
public class findContinuousSequence_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findContinuousSequence(9));
	}
	public static int[][] findContinuousSequence(int target) {
        List<int[]> res= new ArrayList<>();
        int l=1;
        int r=2;
        int count=l+r;
        while(l<r){
            if(count==target){
                int[] temp=new int[r-l+1];
                for(int i=0;i<temp.length;i++)
                    temp[i]=i+l;
                res.add(temp);
                count-=l;
                l++;
                continue;
            }
            else if(count<target){
                r++;
                count+=r;
            }
            else{
            	count-=l;
                 l++;
                 
            }
            System.out.println(l+"~"+r+"~"+count);
               
        }
        for(int[] i:res){
        	for(int k:i)
        		System.out.print(k);
        	System.out.println();
        }
        	
        		
        return res.toArray(new int[res.size()][]);
    }
}
