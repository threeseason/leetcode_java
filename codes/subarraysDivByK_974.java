import java.util.HashMap;
import java.util.Map;

public class subarraysDivByK_974 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={-1,2,9};
				
		int K=2;
		System.out.println(subarraysDivByK(A,K));
	}
	public static int subarraysDivByK(int[] A, int K) {
        int count=0;
        Map<Integer,Integer> m = new HashMap<>();
        m.put(0,1);
        int[] p=new int[A.length+1];
        int sum=0;
        for(int i:A){
        	sum+=i;
            int cur=(sum%K+K)%K;
            count+=m.containsKey(cur)?m.get(cur):0;
            m.put(cur,m.getOrDefault(cur,0)+1);
            System.out.println("i="+i+"cur="+cur+"count="+count);
    
        }
        return count;
    }

}
