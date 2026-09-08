class Solution {
    public boolean judgeSquareSum(int c) {

     int low=0;
     int high=(int)Math.sqrt(c);
    
    
      while(low<=high){
        
           long ans=(long)low*low +(long)high*high;
          
       if(ans==c)return true;

         if(ans>c){
            high=high-1;}        

         else if(ans<c){
            low=low+1;
         }

      }

   

   return false;
    }
}