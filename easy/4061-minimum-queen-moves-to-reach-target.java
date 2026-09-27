class Solution {
    public int minQueenMoves(int[] source, int[] target) {

    int sty=source[1];
    int stx=source[0];

    int trgy=target[1];
    int trgx=target[0];

    if(sty==trgy && stx==trgx)return 0;
    if(sty==trgy || stx==trgx)return 1;

    for(int i=0;i<=8;i++){
    //down diag

    if(source[0]-i==target[0] && source[1]-i==target[1])return 1;

   // up diag
       
       if(source[0]+i==target[0]&& source[1]+i==target[1])return 1;

  // row up col down
       
       if(source[0]+i==target[0] && source[1]-i==target[1])return 1;

  // row dow col up

     if(source[0]-i==target[0] && source[1]+i==target[1])return 1;
    } 
    
    
    return 2;
    }
}