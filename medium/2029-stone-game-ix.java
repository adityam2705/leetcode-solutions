class Solution {
    public boolean stoneGameIX(int[] stones) {
        int rem0=0;
        int rem1=0;
        int rem2=0;
        
     for(int i=0;i<stones.length;i++){      
       if(stones[i]%3==0)rem0++;
        if(stones[i]%3==1)rem1++;
        if(stones[i]%3==2)rem2++;
         }
     
    if(rem0%2==0){
 if(rem2>0 && rem1>0){return true;} }
    else{
      return Math.abs(rem1-rem2)>2 ;
       }
     
     return false;
    }
}