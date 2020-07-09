import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class LRUCache {
    LinkedList<Integer> l;
    Map<Integer,Integer> m;
    int cap;
    int have;
    public LRUCache(int capacity) {
        l=new LinkedList<>();
        m=new HashMap<>();
        cap=capacity;
        have=0;
    }
    
    public int get(int key) {
    	//System.out.println("get");
    	
        if(m.containsKey(key)){
            //l.remove(key);
        	l.remove((Integer)key);
            l.add(key);
//            for(int i:l)
//        		System.out.print(i);
//            System.out.println();
            return m.get(key);
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
    	if(have==cap&&!m.containsKey(key)){
            int del_num=l.removeFirst();
            m.remove(del_num);
            have--;
        }
        if(!m.containsKey(key)){
        	l.add(key);
        	have++;
        }
        else{
            l.remove((Integer)key);
            l.add(key);
        }
        m.put(key,value);
    }
}
public class LRU_146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LRUCache cache = new LRUCache( 2 /* �������� */ );
		System.out.println(cache.get(2));
		cache.put(2,6);
		System.out.println(cache.get(1));      // ����  1
		cache.put(1, 5);    // �ò�����ʹ����Կ 2 ����
		//System.out.println(cache.get(2));      // ���� -1 (δ�ҵ�)
		cache.put(1, 2);    // �ò�����ʹ����Կ 1 ����
		System.out.println(cache.get(1));       // ���� -1 (δ�ҵ�)
		System.out.println(cache.get(2));       // ����  3
		//System.out.println(cache.get(4));      // ����  4


	}

}
