//����һ������Ϊ n �����ӣ�������Ӽ����������ȵ� m �Σ�m��n����������n>1����m>1����ÿ�����ӵĳ��ȼ�Ϊ k[0],k[1]...k[m] ������ k[0]*k[1]*...*k[m] ���ܵ����˻��Ƕ��٣����磬�����ӵĳ�����8ʱ�����ǰ������ɳ��ȷֱ�Ϊ2��3��3�����Σ���ʱ�õ������˻���18��
//
//����Ҫȡģ 1e9+7��1000000007����������ʼ���Ϊ��1000000008���뷵�� 1��
//

public class cuttingRope_14 {

	public static void main(String[] args) {
		int n=120;
		System.out.println(cuttingRope(n));

	}
	public static int cuttingRope(int n) {
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        int a=n%3;
        if(a==0)
            return (int)helper(n/3);
        if(a==1)
            return (int)((helper(n/3-1)*4)%1000000007);
        return (int)(helper(n/3)*2%1000000007);
    }
    private static long helper(int x){
        int p=1000000007;
        long rem=1;
        while(x>0){
            rem=(rem*3)%p;
            x--;
        }
        //System.out.println((int)(rem*4%1000000007));
        return rem;
    }
}
