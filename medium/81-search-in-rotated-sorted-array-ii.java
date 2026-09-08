class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0,j=nums.length-1 ;i<nums.length;i++,j--){
            if(target==nums[i]|| target==nums[j]){
                return true;
            }
        }
   return false; }
}