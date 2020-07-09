import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class findLadders {
    Map<String,List<String>> map = new HashMap<>();
    Map<String,Boolean> visited=new HashMap<>();
    List<List<String>> res;
    int min_length;
    public List<List<String>> main(String beginWord, String endWord, String[] wordList) {
        res=new ArrayList<>();
        min_length=wordList.length;
        for(String s:wordList){
            //System.out.println(s);
            visited.put(s,false);
        }
        visited.put(beginWord,true);
        map.put(beginWord,new ArrayList<String>());
        for(String s1:wordList){
        	if(!map.containsKey(s1)){
	            map.put(s1,new ArrayList<String>());
	            for(String s2:map.keySet())
	                if(getDis(s1,s2)==1){
	                    List<String> temp1=map.get(s2);
	                    temp1.add(s1);
	                    List<String> temp2=map.get(s1);
	                    temp2.add(s2);
	                }
        	}
        }
        for(String s :map.keySet()){
        	System.out.print(s+":");
        	for(String s2:map.get(s))
        		System.out.print(s2+" ");
        	System.out.println();
        }
        List<String> path = new ArrayList<>();
        path.add(beginWord);
        helper(path,wordList,beginWord,endWord);
        return res;
    }
    private void helper(List<String> path,String[] wordList,String curword,String endWord){
        System.out.println(curword);
        for(String s:path)
        	System.out.print(s+" ");
        System.out.println();
        //System.out.println(visited.get(curword));
        if(curword.equals(endWord)){
            res.add(new ArrayList<>(path));
            if(path.size()<=min_length){
                min_length=path.size();
                List<List<String>> new_res=new ArrayList<>();
                for(List<String> temp:res){
                    if(temp.size()==min_length)
                        new_res.add(temp);
                }
                res=new_res;
                System.out.println(res.size());
            }
            System.out.println("getone");
            return;
        }
        if(path.size()>=min_length)
            return;
        //System.out.println(curword+":");
        for(String s:map.get(curword)){
            if(visited.get(s)==false){
            	//System.out.print(s);
                visited.put(s,true);
                path.add(s);
                helper(path,wordList,s,endWord);
                path.remove(s);
                visited.put(s,false);
            }
        }
        //System.out.println();
    }
    private int getDis(String s1,String s2){
        int count=0;
        for(int i=0;i<s1.length();i++)
            if(s1.charAt(i)!=s2.charAt(i))
                count++;
        return count;
    }
}

public class findLadders_126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beginWord="cet";
		String endWord="ism";
		String[] wordList={"kid","tag","pup","ail","tun","woo","erg","luz","brr","gay","sip","kay","per","val","mes","ohs","now","boa","cet","pal","bar","die","war","hay","eco","pub","lob","rue","fry","lit","rex","jan","cot","bid","ali","pay","col","gum","ger","row","won","dan","rum","fad","tut","sag","yip","sui","ark","has","zip","fez","own","ump","dis","ads","max","jaw","out","btu","ana","gap","cry","led","abe","box","ore","pig","fie","toy","fat","cal","lie","noh","sew","ono","tam","flu","mgm","ply","awe","pry","tit","tie","yet","too","tax","jim","san","pan","map","ski","ova","wed","non","wac","nut","why","bye","lye","oct","old","fin","feb","chi","sap","owl","log","tod","dot","bow","fob","for","joe","ivy","fan","age","fax","hip","jib","mel","hus","sob","ifs","tab","ara","dab","jag","jar","arm","lot","tom","sax","tex","yum","pei","wen","wry","ire","irk","far","mew","wit","doe","gas","rte","ian","pot","ask","wag","hag","amy","nag","ron","soy","gin","don","tug","fay","vic","boo","nam","ave","buy","sop","but","orb","fen","paw","his","sub","bob","yea","oft","inn","rod","yam","pew","web","hod","hun","gyp","wei","wis","rob","gad","pie","mon","dog","bib","rub","ere","dig","era","cat","fox","bee","mod","day","apr","vie","nev","jam","pam","new","aye","ani","and","ibm","yap","can","pyx","tar","kin","fog","hum","pip","cup","dye","lyx","jog","nun","par","wan","fey","bus","oak","bad","ats","set","qom","vat","eat","pus","rev","axe","ion","six","ila","lao","mom","mas","pro","few","opt","poe","art","ash","oar","cap","lop","may","shy","rid","bat","sum","rim","fee","bmw","sky","maj","hue","thy","ava","rap","den","fla","auk","cox","ibo","hey","saw","vim","sec","ltd","you","its","tat","dew","eva","tog","ram","let","see","zit","maw","nix","ate","gig","rep","owe","ind","hog","eve","sam","zoo","any","dow","cod","bed","vet","ham","sis","hex","via","fir","nod","mao","aug","mum","hoe","bah","hal","keg","hew","zed","tow","gog","ass","dem","who","bet","gos","son","ear","spy","kit","boy","due","sen","oaf","mix","hep","fur","ada","bin","nil","mia","ewe","hit","fix","sad","rib","eye","hop","haw","wax","mid","tad","ken","wad","rye","pap","bog","gut","ito","woe","our","ado","sin","mad","ray","hon","roy","dip","hen","iva","lug","asp","hui","yak","bay","poi","yep","bun","try","lad","elm","nat","wyo","gym","dug","toe","dee","wig","sly","rip","geo","cog","pas","zen","odd","nan","lay","pod","fit","hem","joy","bum","rio","yon","dec","leg","put","sue","dim","pet","yaw","nub","bit","bur","sid","sun","oil","red","doc","moe","caw","eel","dix","cub","end","gem","off","yew","hug","pop","tub","sgt","lid","pun","ton","sol","din","yup","jab","pea","bug","gag","mil","jig","hub","low","did","tin","get","gte","sox","lei","mig","fig","lon","use","ban","flo","nov","jut","bag","mir","sty","lap","two","ins","con","ant","net","tux","ode","stu","mug","cad","nap","gun","fop","tot","sow","sal","sic","ted","wot","del","imp","cob","way","ann","tan","mci","job","wet","ism","err","him","all","pad","hah","hie","aim","ike","jed","ego","mac","baa","min","com","ill","was","cab","ago","ina","big","ilk","gal","tap","duh","ola","ran","lab","top","gob","hot","ora","tia","kip","han","met","hut","she","sac","fed","goo","tee","ell","not","act","gil","rut","ala","ape","rig","cid","god","duo","lin","aid","gel","awl","lag","elf","liz","ref","aha","fib","oho","tho","her","nor","ace","adz","fun","ned","coo","win","tao","coy","van","man","pit","guy","foe","hid","mai","sup","jay","hob","mow","jot","are","pol","arc","lax","aft","alb","len","air","pug","pox","vow","got","meg","zoe","amp","ale","bud","gee","pin","dun","pat","ten","mob"};
		findLadders obj = new findLadders();
		List<List<String>> res=obj.main(beginWord, endWord, wordList);
		for(List<String> l:res){
			for(String s:l)
				System.out.print(s+" ");
			System.out.println();
		}
	}

}
