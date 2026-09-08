class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board);
    }
     boolean backtrack(char[][] board){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
             if(board[row][col]!='.'){continue;}
                for(char ch='1';ch<='9';ch++){
                  if(isvalid(board,row,col,ch)){
                       board[row][col]=ch;
                        if(backtrack(board)) return true;
                        board[row][col]='.';} }
                     return false;   }}

                return true; }
       
       boolean isvalid( char[][] board,int row, int col, char ch){
         
             for(int i=0;i<9;i++){
                 if(board[row][i]==ch)return false;
                 if(board[i][col]==ch)return false; }

            int rown=(row/3)*3;
            int coln=(col/3)*3;

            for(int i=rown;i<rown+3;i++){
                for(int j=coln;j<coln+3;j++){
                   if(board[i][j]==ch)return false;
                }
            }
      return true;
     }
}