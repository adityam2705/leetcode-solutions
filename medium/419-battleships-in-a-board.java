class Solution {
    public int countBattleships(char[][] board) {
      int m=board.length;
      int n=board[0].length;
      int count=0;

      boolean[][] visited = new boolean [m][n];
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(!visited[i][j] && board[i][j]=='X'){
                dfs(i,j,visited,board);
                count++;
            }
        }
      }

   return count;
    }

    void dfs(int i, int j, boolean [][] visited,char[][] board){

      if(i>=board.length || j>=board[0].length || i<0 || j<0 || board[i][j]=='.' || visited[i][j]) return;

       visited[i][j]=true;
      dfs(i+1,j,visited,board);
      dfs(i-1,j,visited,board);
      dfs(i,j-1,visited,board);
      dfs(i,j+1,visited,board);

    }
}