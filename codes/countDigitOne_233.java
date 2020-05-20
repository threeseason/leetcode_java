//给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。

//分别计算个位十位百位。。。中1的出现次数
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
