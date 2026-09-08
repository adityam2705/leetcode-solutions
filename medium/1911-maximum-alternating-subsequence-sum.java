class Solution {
    public long maxAlternatingSum(int[] nums) {
      
      long n=nums.length;
      long[][] dp= new long[nums.length+1][2];

     for(int i=1;i<=nums.length;i++){
       
       dp[i][0]=Math.max(dp[i-1][1]-nums[i-1],dp[i-1][0]);
       dp[i][1]=Math.max(dp[i-1][0]+nums[i-1],dp[i-1][1]);     }
 
      return Math.max(dp[nums.length][0],dp[nums.length][1]);

   }
 }
