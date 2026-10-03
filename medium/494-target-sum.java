class Solution {
   int[][] dp;
    public int findTargetSumWays(int[] nums, int target) {

    int sum=0;
    for(int i :nums){sum+=i;}
     
    if(sum+target<0||(sum+target)%2!=0){return 0;}

    dp=new int[nums.length][(sum+target/2)+1];

    for(int i=0;i<nums.length;i++){
        Arrays.fill(dp[i],-1);}

   return recurse(0,nums,(sum+target)/2,0);   
    }

    int recurse(int i,int[] nums,int target,int sum){
    
    if(sum>target)return 0;
  
    if(i==nums.length){
     if(sum==target){
        return 1;}
       return 0;}

    if(dp[i][sum]!=-1){return dp[i][sum];}

   int take= recurse(i+1,nums,target,sum+nums[i]);
   int nottake= recurse(i+1,nums,target,sum);

    return dp[i][sum]=take+nottake;
    }
}