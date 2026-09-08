class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = 1_000_000;

        while(low<=high){
            int mid = low + (high - low)/2;

            if(isPossible(nums, threshold, mid)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean isPossible(int[] nums, int threshold, int mid){
        int sum = 0;
        for(int num:nums){
            sum += (num + mid-1)/mid;
        }

        return sum<=threshold;
    }
}