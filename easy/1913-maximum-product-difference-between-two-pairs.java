class Solution {
    public int maxProductDifference(int[] nums) {
        int j= nums.length-1;
        int i=0;
        Arrays. sort(nums);
return (nums[j]*nums[j-1]-nums[i]*nums[i+1]);
    }
}