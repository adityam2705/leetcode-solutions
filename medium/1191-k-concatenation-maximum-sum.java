class Solution {
    public int kConcatenationMaxSum(int[] nums, int k) {
    
    int mod=1000000007;
    int n=nums.length;
    long count=nums[0];
    long sum=0;
    long max=nums[0];
    
    if(k>=2){

    for(int i=0;i<n;i++){
      sum+=nums[i];}

    long prefix = 0;
    long maxPrefix = Long.MIN_VALUE;

   for(int i=0;i<n;i++){
    prefix+=nums[i];
    maxPrefix=Math.max(maxPrefix, prefix);}

   long suffix = 0;
   long maxSuffix = Long.MIN_VALUE;

  for(int i=n-1;i>=0;i--){
    suffix+=nums[i];
    maxSuffix=Math.max(maxSuffix, suffix);}

    for(int i=1;i<2*n;i++){
      count=Math.max(0,count+nums[i%n]);
      max=Math.max(count,max);} 

    if(sum>0){
      max=maxPrefix+maxSuffix+(long)(k-2)*sum;} 
    
    return (int)(max%mod);}

    count=0;
    max=0;

    for(int i=0;i<n;i++){
      count=Math.max(0,count+nums[i%n]);
      max=Math.max(count,max);}
  
     return (int)max%mod;

    }
}