class Solution {
    public int minSubArrayLen(int target, int[] nums) {int l=0;
        int n=nums.length;
        int sum=0;
        int min=Integer.MAX_VALUE;
    for(int r=0;r<n;r++){
                sum+=nums[r];   
           while(sum>=target){
           min=Math.min(r-l+1,min);
            sum=sum-nums[l];
            l++;} }
        return (min==Integer.MAX_VALUE)?0:min;
        
    }
}