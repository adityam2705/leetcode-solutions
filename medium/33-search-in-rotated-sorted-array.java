class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        
        int high=nums.length-1;
        while (low <= high) {
    int mid = low + (high - low) / 2;  // Prevents overflow
    
    if (nums[mid] == target) {
        return mid;
    }
         if(nums[low] <= nums[mid]) {
        // Target is in the sorted left half
        if (nums[low] <= target && target < nums[mid]) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    } 
    // Right half must be sorted
    else {
        // Target is in the sorted right half
        if (nums[mid] < target && target <= nums[high]) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
}
return -1;

    }
}