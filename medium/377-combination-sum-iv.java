class Solution {
    Integer[] dp;
    public int combinationSum4(int[] nums, int target) {
               dp = new Integer[target + 1];
          return backtrack(nums,target,0);}

    int backtrack(int[]nums,int target,int count){
        if(count>target){
                return 0;}
        if(count==target){
                return 1;}
        if(dp[count] != null)   //
            return dp[count];
            int result=0;
               for(int i=0;i<nums.length;i++){
                result+=backtrack(nums,target,count+nums[i]);    }
                return dp[count]=result;                           }
            
    
}