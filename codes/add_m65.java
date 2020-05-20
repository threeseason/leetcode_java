
//写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。

//s=a+b可转化为s=n+c，其中n为异或结果，c为进位，循环直至c为零则n为结果
public class add_m65 {

	public static void main(String[] args) {
		int a=-10,b=5;
		System.out.println(add(a,b));

	}
	 public static int add(int a, int b) {
	        if(b==0)
	            return a;
	        int c=(a&b)<<1;
	        int n=a^b;
	        return add(n,c);
	    }

}
