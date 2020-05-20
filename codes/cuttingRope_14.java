//给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m] 。请问 k[0]*k[1]*...*k[m] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
//
//答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
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
