import java.util.ArrayList;
import java.util.List;

//����һ�������� target ��������к�Ϊ target ���������������У����ٺ�������������
//
//�����ڵ�������С�������У���ͬ���а����׸����ִ�С�������С�


//˫ָ�뷨
//������һ��Ϊ��ָ��i���ڶ���Ϊ��ָ��j����Ϊsum(i...j)
//ָ��ֻ������
//�ʹ���Ŀ�����ƶ���ָ�룬С�����ƶ���ָ�룬���������𰸼���ͬһ����ָ��Ĵ�ֻ����һ������ʱ�ƶ���ָ��
//��ָ����ڵ�����ָ����ֹѭ��
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
