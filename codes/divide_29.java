
//给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
//
//返回被除数 dividend 除以除数 divisor 得到的商。
//
//整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2


public class divide_29 {

	public static void main(String[] args) {
		int dividend = -10, divisor = 3;
		System.out.println(divide(dividend,divisor));

	}
	public static int divide(int dividend, int divisor) {
        boolean flag1=dividend>0;
        boolean flag2=divisor>0;
        long d1 = dividend;
        long d2 = divisor;
        d1=flag1?d1:-d1;
        d2=flag2?d2:-d2;
        long res=helper(d1,d2);
        res=flag1==flag2?res:-res;
        if(res>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return (int)res;
    }
    private static long helper(long dividend,long divisor){
        if(dividend<divisor)
            return 0;
        long d1=divisor;
        long temp=1;
        while(dividend>d1+d1){
            d1=d1+d1;
            temp=temp+temp;
        }
        System.out.println(temp);
        return temp+helper(dividend-d1,divisor);
    }

}
