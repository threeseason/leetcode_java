//我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。
//求按从小到大的顺序的第 n 个丑数。

//可以把res[n]看作之前的某个数乘以2/3/5
public class nthUglyNumber_m49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		System.out.println(nthUglyNumber(n));
	}
	public static int nthUglyNumber(int n) {
        int a=0,b=0,c=0;
        int[] res= new int[n];
        res[0]=1;
        for(int i=1;i<n;i++){
            int n1=res[a]*2,n2=res[b]*3,n3=res[c]*5;
            res[i]=Math.min(Math.min(n1,n2),n3);
            if(res[i]==n1)a++;
            if(res[i]==n2)b++;
            if(res[i]==n3)c++;
        }
        return res[n-1];
    }

}
