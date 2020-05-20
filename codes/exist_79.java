
public class exist_79 {
	static String Word;
	public static void main(String[] args) {
		String word ="ABCESEEEF";
		char[][] board={{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}};
		System.out.println(exist(board,word));
	}
	
    public static boolean exist(char[][] board, String word) {
        Word=word;
        
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
            	boolean[][] visited=new boolean[board.length][board[0].length];
            	System.out.println("i="+i+"j="+j);
            	if(helper(board,word,i,j,visited))
                    return true;
            }
                
        return false;
    }
    private static boolean helper(char[][] board,String word,int x,int y,boolean[][] visited){
    	if(word.length()==0)
            return true;
    	if(x<0||y<0||x>=board.length||y>=board[0].length)
            return false;
        if(visited[x][y])
            return false;
        if(board[x][y]==word.charAt(0)){
            visited[x][y]=true;
            String temp=word.substring(1);
            System.out.println(temp);
           if(helper(board,temp,x-1,y,visited)||helper(board,temp,x,y-1,visited)||helper(board,temp,x+1,y,visited)||helper(board,temp,x,y+1,visited))
        	   return true;
           visited[x][y]=false;
        }
        return false;
    }

}
