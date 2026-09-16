class Solution {
    boolean[][] dp; 
    public boolean canPartition(int[] nums) {
    int sum=0;

    for(int i=0;i<nums.length;i++){sum+=nums[i];}
    
    if(sum%2==1)return false;

    dp= new boolean[nums.length][sum/2+1];
     
    if(nums[0]<=sum/2)dp[0][nums[0]]=true;

    for(int i=0;i<nums.length;i++){dp[i][0]=true;}

    for(int i=1;i<nums.length;i++){
      for(int j=1;j<=sum/2;j++){
       
       boolean nottake=dp[i-1][j];
     
       boolean take=false;
        if(nums[i]<=j){
        take=dp[i-1][j-nums[i]];}
    
       dp[i][j]=(take||nottake);
      }
    }

    return dp[nums.length-1][sum/2];
    }
}