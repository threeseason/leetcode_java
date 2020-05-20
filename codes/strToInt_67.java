import java.util.LinkedList;
import java.util.Queue;

public class strToInt_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="+1";
		System.out.println(strToInt(str));
	}
	public static int strToInt(String str) {
        str=str.trim();
        if(str.length()==0)
            return 0;
        int res=0;
        Queue<Character> s = new LinkedList<>();
        boolean posi=true;
        if(!Character.isDigit(str.charAt(0))&&str.charAt(0)!='-'&&str.charAt(0)!='+')
            return 0;
        int i=0;
        if(str.charAt(0)=='-'||str.charAt(0)=='+'){
            posi=str.charAt(0)=='+';
            i++;
        }
        for(;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i)))
                break;
            s.add(str.charAt(i));
        }
        while(!s.isEmpty()){
            if((Integer.MAX_VALUE-(s.peek()-'0'))/10<res)
                return posi?Integer.MAX_VALUE:Integer.MIN_VALUE;
            res=res*10+s.poll()-'0';
            System.out.println("res="+res);
        }
        return posi?res:-res;
    }

}
