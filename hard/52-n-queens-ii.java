class Solution {
      int count=0;
    public int totalNQueens(int n) {
   char[][] board = new char[n][n];
   
   
   for(int i=0;i<n;i++){
       Arrays.fill(board[i],'.');}
       
      backtrack(board,0,n);
         
            
   return count;
    }
    
boolean backtrack(char[][] board,int row,int n){
    if(row==n){count++;
    return true;}
    
    for(int i=0;i<n;i++){
  if(isposs(board,row,i,n)==true){
        board[row][i]='Q'; if(backtrack(board,row+1,n)==false) 
        board[row][i]='.';} }
        
        
        return false;
    }
    
    
 boolean isposs( char[][]  board, int row, int col, int n){
      for(int i=row-1;i>=0;i--){                     //upwards
                   if( board[i][col]== 'Q'){
                       return false;}
                               }
          for(int i=row-1,j=col+1; i>=0 && j<n ; i-- , j++){     //diagonal right
                   if( board[i][j]== 'Q'){
                       return false;}
                               }
          for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){            //diagonal left
                         if(board[i][j]== 'Q'){
                       return false;}
                                 } 
                   return true;
    
    
}}