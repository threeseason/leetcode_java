//给定一个由表示变量之间关系的字符串方程组成的数组，每个字符串方程 equations[i] 的长度为 4，并采用两种不同的形式之一："a==b" 或 "a!=b"。在这里，a 和 b 是小写字母（不一定不同），表示单字母变量名。
//
//只有当可以将整数分配给变量名，以便满足所有给定的方程时才返回 true，否则返回 false。
class equationsPossible2 {
    int[] parent ;
    int[] num;
    public boolean main (String[] equations) {
        parent = new int[26];
        num=new int[26];
        for(int i=0;i<26;i++){
            parent[i]=i;
            num[i]=1;
        }
        for(String s:equations){
            char ch1=s.charAt(0);
            char ch2=s.charAt(3);
            if(s.charAt(1)=='=')
                union(ch1,ch2);
        }
        
        for(String s:equations){
            char ch1=s.charAt(0);
            char ch2=s.charAt(3);
            if(s.charAt(1)=='!'&&find(ch1-'a')==find(ch2-'a')){
            	System.out.println(find(ch1-'a'));
            	System.out.println(find(ch2-'a'));
            	return false;
            }
                
        }
        return true;
    }
    private void union(char ch1,char ch2){
        if(ch1==ch2)
            return;
        if(num[parent[ch1-'a']]>num[parent[ch2-'a']]){
            parent[parent[ch2-'a']]=parent[ch1-'a'];
            num[ch1-'a']++;
        }
        else{
            parent[parent[ch1-'a']]=parent[ch2-'a'];
            num[ch2-'a']++;
        }
    }
    private int find(int index){
        if(parent[index]==index)
            return index;
        else return find(parent[index]);
    }
}
class equationsPossible {
    public boolean main(String[] equations) {
        int[][] map=new int[26][26];
        for(int i=0;i<26;i++)
            map[i][i]=1;
        for(String s:equations){
            char ch1=s.charAt(0);
            char ch2=s.charAt(3);
            if(s.charAt(1)=='='){
                for(int i=0;i<26;i++){
                	if(map[ch1-'a'][i]==1){
                		if(map[ch2-'a'][i]==2){
                			System.out.println("ch1="+ch1+",ch2="+ch2+",i="+i+",11");
                			return false;
                		}
                		map[ch2-'a'][i]=1;
                		map[i][ch2-'a']=1;
                	}
                	if(map[ch2-'a'][i]==1){
                		if(map[ch1-'a'][i]==2){
                			System.out.println("ch1="+ch1+",ch2="+ch2+",i="+i+",12");
                			return false;
                		}
                		map[ch1-'a'][i]=1;
                		map[i][ch1-'a']=1;
                	}
                }
            }
            else{
                for(int i=0;i<26;i++){
                	if(map[ch1-'a'][i]==1){
                		if(map[ch2-'a'][i]==1){
                			System.out.println("ch1="+ch1+",ch2="+ch2+",i="+i+",21");
                			return false;
                		}	
                		map[ch2-'a'][i]=2;
                		map[i][ch2-'a']=2;
                	}
                	if(map[ch2-'a'][i]==1){
                		if(map[ch1-'a'][i]==1){
                			System.out.println("ch1="+ch1+",ch2="+ch2+",i="+i+",22");
                			return false;
                		}	
                		map[ch1-'a'][i]=2;
                		map[i][ch1-'a']=2;
                	}
                }
            }
        }                       
        return true;
    }
}
public class equationsPossible_990 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] equations={"a==b","b!=c","c==a"};
		equationsPossible2 obj=new equationsPossible2();
		System.out.println(obj.main(equations));
	}

}
