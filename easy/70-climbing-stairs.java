class Solution {
    public int climbStairs(int n) {
     if(3>=n)   return n;
  
     int a=2;
     int b=3;
     int c=0;

     for(int i=3;i<n;i++){
          c=a+b;
          a=b;
          b=c;
     }
     
     return c;
    }

}