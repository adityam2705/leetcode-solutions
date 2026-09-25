class Solution {
    public int maxSubarraySumCircular(int[] nums) {
    
    int n=nums.length;
    int sum=nums[0];
    int count=nums[0];
    int max=nums[0];   
    int currentMax=nums[0];
    int maxSum=nums[0];

    for(int i=1;i<n;i++){
    
    count+=nums[i];
    sum=Math.min(nums[i],sum+nums[i]);
    max=Math.min(sum,max);

    currentMax=Math.max(nums[i],currentMax+nums[i]);
    maxSum=Math.max(maxSum,currentMax); }

    if(maxSum<0)return maxSum;

    return Math.max(maxSum,count-max);
    }
}