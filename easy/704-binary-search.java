class Solution {
    public int search(int[] nums, int target) {
        int right=nums.length-1;
        int left=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
              return mid;
            }
            if(nums[mid]<target){
              left=left+1;
            }
            if(nums[mid]>target){
              right=right-1;
            }
        }
   return -1; }
}