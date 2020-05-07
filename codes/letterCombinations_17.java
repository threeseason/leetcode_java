import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
//
//给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
public class letterCombinations_17 {
	static Map<String, String> phone = new HashMap<String,String>(){
        {
            put("2","abc");
            put("3","def");
            put("4","ghi");
            put("5","jkl");
            put("6","mno");
            put("7","pqrs");
            put("8","tuv");
            put("9","wxyz");
        }
    };
    static List<String> res = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nums="23";
		System.out.println(letterCombinations(nums));

	}
	public static List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return res;
        process("",digits);
        return res;
    }
    private static void process(String ed,String digits){
        if(digits.length()==0)
            res.add(ed);
        else{
        	String temp="";
            String num = digits.substring(0,1);
            String letters = phone.get(num);
            for(int i=0;i<letters.length();i++){
                String letter=letters.substring(i,i+1);
                temp = ed +letter;
                process(temp,digits.substring(1));
            }
        }
    }

}
