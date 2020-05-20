
public class lastRemaining_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=70866;
		int m=116922;
		System.out.println(lastRemaining2(n,m));
	}
	public static int lastRemaining(int n, int m) {
        double N=(double)n*(double)m;
        System.out.println("N="+N);
        while(N>n){
            double k=Math.floor((N-n-1)/(m-1));
            N=k+N-n;
            System.out.println(k+"===>"+N);
        }
        return (int)N-1;
    }
	public static int lastRemaining2(int n,int m){
		double D=1;
		double temp=(double)n*(double)m;
		while(D<=temp-(double)n){
			D=Math.ceil(m*D/(m-1));
		}
		
		return (int)(temp-D);
	}

}
