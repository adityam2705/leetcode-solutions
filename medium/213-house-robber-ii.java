class Solution {
     int[] dp;
    public int rob(int[] nums) {

  if(nums.length==1)return nums[0];         
        
        dp = new int[nums.length+1];
         Arrays.fill(dp,-1);

         int first=solve(nums,1,nums.length-1);
         
        dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);

         int second=solve(nums,0,nums.length-2);
    
     return Math.max(first,second);  }

    int solve(int[] nums,int i,int end){
      
      if(end<i)return 0;

        if(dp[i]!=-1)return dp[i];

     int steal=nums[i]+solve(nums,i+2,end);
     int skip=solve(nums,i+1,end);

     return dp[i]=Math.max(steal,skip);
    }
}