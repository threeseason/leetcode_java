//����һ������ n����������С�ڵ��� n �ķǸ����������� 1 ���ֵĸ�����

//�ֱ�����λʮλ��λ��������1�ĳ��ִ���
public class countDigitOne_233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		System.out.println(countDigitOne(n));
	}
	public static int countDigitOne(int n) {
        if(n<=0)
            return 0;
        int high=n/10,cur=n%10;
        int low=0,res=0,d=1;
        while(high!=0||cur!=0){
            if(cur==0)res+=high*d;
            else if(cur==1)res+=high*d+low+1;
            else res+=(high+1)*d;
            low+=cur*d;
            cur=high%10;
            high/=10;
            d*=10;
        }
        return res;
    }

}
