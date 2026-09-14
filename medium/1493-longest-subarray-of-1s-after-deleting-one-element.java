class Solution {
    public int longestSubarray(int[] nums) {
      int allowed=1;
      int i=0;
      int max=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0 && allowed>=0){allowed--;}
               while(allowed<0){ 
                   if(nums[i]==0)allowed++;
                     i++;
               }
               max=Math.max(max,j-i);
        }
    return max;}
}