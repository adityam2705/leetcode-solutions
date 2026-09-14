class Solution {
    public void solve(char[][] board) {
        
        int m=board.length;
        int n=board[0].length;
        boolean[][] visited = new boolean[m][n];

   // top
        for(int i=0;i<n;i++){
            if(board[0][i]=='O' && !visited[0][i]){
                dfs(0,i,visited,board);
            }
        }
  // bottom
        for(int i=0;i<n;i++){
            if(board[m-1][i]=='O' && !visited[m-1][i]){
                dfs(m-1,i,visited,board);
            }
        }

// left
        for(int i=0;i<m;i++){
            if(board[i][0]=='O' && !visited[i][0]){
                dfs(i,0,visited,board);
            }
        }
 
 //right
         for(int i=0;i<m;i++){
            if(board[i][n-1]=='O' && !visited[i][n-1]){
                dfs(i,n-1,visited,board);
            }
        }

       for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
           if( board[i][j]=='O' &&  !visited[i][j]){
               board[i][j]='X';
           }
         }
       }

    }
  
  void dfs(int i,int j,boolean[][] visited ,char[][] board){

 if(i>=board.length || j>=board[0].length || i<0 ||j<0 || visited[i][j] ||board[i][j]=='X')return;

      visited[i][j]=true;

      dfs(i+1,j,visited,board);
      dfs(i-1,j,visited,board);
      dfs(i,j+1,visited,board);
      dfs(i,j-1,visited,board);
 
  }
    
}