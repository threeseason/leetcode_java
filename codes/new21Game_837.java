//����˿����һ�����»���ֽ����Ϸ ��21�㡱 �������Ϸ���������£�
//
//����˿�� 0 �ֿ�ʼ���������ĵ÷����� K ��ʱ��ȡ���֡� ��ȡʱ������ [1, W] �ķ�Χ��������һ��������Ϊ���������ۼƣ����� W �������� ÿ�γ�ȡ���Ƕ����ģ�����������ͬ�ĸ��ʡ�
//
//������˿��ò����� K ��ʱ������ֹͣ��ȡ���֡� ����˿�ķ��������� N �ĸ����Ƕ��٣�


//ʹ�ö�̬�滮��dp[x]��ʾ�Ե�Ŀǰ����Ϊxʱ�Ļ�ʤ���ʣ���x>=k&&x<=Math.min(N,K+W-1)ʱdp[x]=1
public class new21Game_837 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10, K = 1, W = 10;
		System.out.println(new21Game(N,K,W));
	}
	public static double new21Game(int N, int K, int W) {
        if(K==0)
            return 1.0;
        double[] dp=new double[K+W+1];
        for(int i=K;i<=N&&i<=K+W-1;i++)
            dp[i]=1.0;
        dp[K-1]=(1.0*Math.min(N,K+W-1)-K+1)/W;
        for(int i=K-2;i>=0;i--)
            dp[i]=dp[i+1]+(dp[i+1]-dp[i+W+1])/W;
        return dp[0];
    }

}
