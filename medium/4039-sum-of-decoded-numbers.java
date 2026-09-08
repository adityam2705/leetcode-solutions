class Solution {
    public int sumDecoded(long[] nums) {
      
      long mod=1000000007;
      long ans=0;
      
    for(int i=0;i<nums.length;i++){
        
        long width=nums[i]%10;
        long d=nums[i]/10;
        
        int len=check(d);
   long div=(long)Math.pow(10,len-width);      
        long x=d/div;
        long y=d%div;
        long num=modpow(x, y,mod);
        
        ans+=(num%mod);          
    }
     
     return (int)(ans%mod);  
    }
    
    int check(long d){
        int size=0;
        
         while(d>0){
            d=d/10;
            size++;}
            
      return size;
    }
  
 long modpow(long x, long y, long mod){
     
     long result=1;
      while(y>0){
          if(y%2==1){
          result=(result*x)%mod ;}
          
      x=(x*x)%mod;
      y=y/2;
      }
     return result;
     
 }
}