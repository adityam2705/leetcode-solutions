class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxleft=0;
        int sum=0;
    
        for(int i=k;i<nums.length;i++){
                maxleft= Math.max(maxleft,nums[i-k]);
                sum=Math.max(sum,maxleft+nums[i]);}
    return sum;
    }
}