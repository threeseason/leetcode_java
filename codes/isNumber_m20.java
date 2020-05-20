

//��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
//���磬�ַ���"+100"��"5e2"��"-123"��"3.1416"��"0123"����ʾ��ֵ����"12e"��"1a3.14"��"1.2.3"��"+-5"��"-1E-16"��"12e+5.4"�����ǡ�

//����״̬����ע������"+.8" "3."���ǺϷ��ġ�
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
