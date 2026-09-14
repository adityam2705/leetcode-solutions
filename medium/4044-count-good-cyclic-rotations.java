class Solution {
    public int countGoodRotations(int[] nums) {
        
       int n=nums.length;
       long sum1=0; 
       long  sum2=0;
       int mid=n/2;
       int count=0;
       
       
  for(int i=0;i<mid;i++){
        sum1+=nums[i];}
       
  for(int i=mid;i<nums.length;i++){
      sum2+=nums[i];}
      
      if(sum1>sum2)count++;
      
      
   for(int i=1;i<nums.length;i++){
       
       int fir=nums[(mid-i+n)%n];
       int sec=nums[n-i];
       
       sum1=sum1-fir+sec;
       sum2=sum2-sec+fir;
       
      if(sum1>sum2)count++;
   }
   
   return count;
    }
}