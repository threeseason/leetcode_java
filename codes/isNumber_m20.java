

//请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
//例如，字符串"+100"、"5e2"、"-123"、"3.1416"、"0123"都表示数值，但"12e"、"1a3.14"、"1.2.3"、"+-5"、"-1E-16"及"12e+5.4"都不是。

//建立状态机，注意其中"+.8" "3."都是合法的。
public class isNumber_m20 {

	public static void main(String[] args) {
		String s="3.";
		System.out.println(isNumber(s));

	}
	public static boolean isNumber(String s) {
		s=s.trim();
        int state=0;
        int[][] trans={{1,2,3,-1,-1},
                       {-1,2,3,-1,-1},
                       {-1,2,7,4,-1},
                       {-1,7,-1,-1,-1},
                       {5,6,-1,-1,-1},
                       {-1,6,-1,-1,-1},
                       {-1,6,-1,-1,-1},
                       {-1,7,-1,4,-1}};
        for(char c:s.toCharArray()){
            int id=getId(c);
            state=trans[state][id];
            if(state==-1)
                return false;
        }
        return state==2||state==7||state==6;
    }
    private static int getId(char c){
        switch(c){
            case '+':
            case '-':return 0;
            case '.':return 2;
            case 'e':return 3;
            default:
                if(c>='0'&&c<='9')return 1;
        }
        return 4;
    }
}
