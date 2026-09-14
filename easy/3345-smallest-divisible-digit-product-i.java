class Solution {
    public int smallestNumber(int n, int t) {

        

  while(true){
     int rem=0;
     int product=1;
      int curr=n;
      while(curr>0){
          rem=curr%10;
          curr=curr/10;
          
          product=product*rem;}
     
    if(product%t==0){return n;}
           n++;
           }


    }
}