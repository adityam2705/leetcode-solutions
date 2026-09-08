class Solution {
    public int minBishopMoves(int[] source, int[] target) {

        int str=0;
        int trg=0;
        

    if((source[0]%2==0 && source[1]%2==0)||(source[0]%2==1 && source[1]%2==1)){
      str=1;}

      if((target[0]%2==0 && target[1]%2==0) ||(target[0]%2==1 && target[1]%2==1)){
      trg=1;}

      if(str!=trg)return -1;

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