

//在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
public class maximalSquare_221 {
	static char[][] Matrix;
	static int[][] Dp;
	public static void main(String[] args) {
		char[][] matirx={{'0','0','0','1'},{'1','1','0','1'},{'1','1','1','1'},{'0','1','1','1'},{'0','1','1','1'}};
		System.out.println(maximalSquare(matirx));
		//System.out.println(matirx[0].length);
	}
	
    public static int maximalSquare(char[][] matrix) {
        Matrix=matrix;
        int res=0;
        Dp = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
        	for(int j=0;j<matrix[0].length;j++){
            	System.out.println("i="+i+",j="+j);
                if(matrix[i][j]=='0')
                    Dp[i][j]=0;
                else{
                    Dp[i][j]=judge(i,j);
                    res=res<Dp[i][j]*Dp[i][j]?Dp[i][j]*Dp[i][j]:res;
                    System.out.println("dp"+i+j+"="+Dp[i][j]);
                }
            }
        }
            
        return res;
    }
    private static int judge(int x,int y){
        if(x==0||y==0)
            return 1;
        return Math.min(Math.min(Dp[x-1][y-1], Dp[x-1][y]), Dp[x][y-1])+1;
    }

}
