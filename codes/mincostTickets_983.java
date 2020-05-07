import java.util.HashSet;
import java.util.Set;

//在一个火车旅行很受欢迎的国度，你提前一年计划了一些火车旅行。在接下来的一年里，你要旅行的日子将以一个名为 days 的数组给出。每一项是一个从 1 到 365 的整数。
//
//火车票有三种不同的销售方式：
//
//一张为期一天的通行证售价为 costs[0] 美元；
//一张为期七天的通行证售价为 costs[1] 美元；
//一张为期三十天的通行证售价为 costs[2] 美元。
//通行证允许数天无限制的旅行。 例如，如果我们在第 2 天获得一张为期 7 天的通行证，那么我们可以连着旅行 7 天：第 2 天、第 3 天、第 4 天、第 5 天、第 6 天、第 7 天和第 8 天。
//
//返回你想要完成在给定的列表 days 中列出的每一天的旅行所需要的最低消费。
//
//

public class mincostTickets_983 {
	int[] d;
	public static void main(String[] args) {
		int[] days = {1,4,6,7,8,20};
		int[] costs = {2,7,15};
		System.out.println(mincostTickets(days,costs));

	}
	 public static int mincostTickets(int[] days, int[] costs) {
	        int[] year = new int[396];
	        Set<Integer> day=new HashSet();
	        for(int i:days)
	            day.add(i);
	        for(int i=366;i<396;i++)
	            year[i]=0;
	        year[365]=day.contains(365)?costs[0]:0;
	        for(int i=364;i>0;i--){
	            year[i]=day.contains(i)?Math.min(Math.min(year[i+1]+costs[0],year[i+7]+costs[1]),year[i+30]+costs[2]):year[i+1];
	        }
	        return year[1];
	    }
	 public int mincostTickets2(int[] days, int[] costs) {
		 	int dlength=days.length;
		 	this.d=days;
	        int[] year = new int[dlength+1];
	        year[dlength]=0;
	       // year[dlength-1]=costs[0];
	        for(int i=dlength-1;i>=0;i--){
	        	year[i]=Math.min(Math.min(year[get(i,1)]+costs[0],year[get(i,7)]+costs[1]), year[get(i,30)]+costs[2]);
             System.out.println(year[i]);
	        }
	        return year[0];
	    }
	private  int get(int i, int j) {
		for(int k=i+1;k<d.length;k++)
			if(d[i]+j<=d[k]){
             
				return k;
			}
		return d.length;
	}
}
