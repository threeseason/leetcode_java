import java.util.Arrays;

public class min_Number_m45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={999999998,999999997,999999999};
		System.out.println(minNumber(nums));
	}
	public static String minNumber(int[] nums) {
		String[] strs= new String[nums.length];
		for(int i=0;i<nums.length;i++)
			strs[i]=String.valueOf(nums[i]);
		Arrays.sort(strs, (x,y)->(x+y).compareTo(y+x));
		StringBuffer res=new StringBuffer();
		//sort2(nums);
		for(String i:strs)
			res.append(i);
		return res.toString();
    }
	//写麻烦了
	private static void sort(int[] nums){
		for(int k1=0;k1<nums.length-1;k1++)
			for(int k2=k1;k2<nums.length;k2++){
				System.out.println(nums[k1]+":"+nums[k2]);
				if(nums[k1]==nums[k2])
					continue;
				String s1=String.valueOf(nums[k1]);
		        String s2=String.valueOf(nums[k2]);
		        int i=-1;
		        int j=-1;
		        while(true){
		        	i=i==s1.length()-1?0:i+1;
		        	j=j==s2.length()-1?0:j+1;
		        	if(s1.charAt(i)>s2.charAt(j)){
		        		System.out.println("bing");
		        		nums[k1]=nums[k1]+nums[k2];
		        		nums[k2]=nums[k1]-nums[k2];
		        		nums[k1]=nums[k1]-nums[k2];
		        		break;
		        	}
		        	if(s1.charAt(i)<s2.charAt(j)){
		        		break;
		        	}
		        }
			}

        
    }
	//大数问题
	private static void sort2(int[] nums){
		for(int k1=0;k1<nums.length-1;k1++)
			for(int k2=k1;k2<nums.length;k2++){
				String s1=String.valueOf(nums[k1]);
		        String s2=String.valueOf(nums[k2]);
		        if(Integer.valueOf(s1+s2)>Integer.valueOf(s2+s1)){
		        	nums[k1]=nums[k1]+nums[k2];
	        		nums[k2]=nums[k1]-nums[k2];
	        		nums[k1]=nums[k1]-nums[k2];
		        }
			}
    }
	


}
