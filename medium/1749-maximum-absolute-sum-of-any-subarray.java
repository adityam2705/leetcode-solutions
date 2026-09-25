class Solution {
    public int maxAbsoluteSum(int[] nums) {
    int sum=0;
    int max=0;
    int sum2=0;
    int max2=0;

    for(int i=0;i<nums.length;i++){

    sum=Math.max(0,nums[i]+sum);
    max=Math.max(max,sum);
    
    sum2=Math.min(0,nums[i]+sum2);
    max2=Math.min(max2,sum2);}

    return Math.max(max,Math.abs(max2));
    }
}