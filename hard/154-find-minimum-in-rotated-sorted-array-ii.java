class Solution {
    public int findMin(int[] nums) {
        int x=nums[0];
        int min=nums[0];
        int left=1;
        int right=nums.length-1;
        while(left<right){
            if(x<=nums[left]){
                x=nums[left];
                left++;
            }
            else{
               min= nums[left];
               break;
            }

        }
         return (nums[right]<min)? nums[right]:min;
    }
}