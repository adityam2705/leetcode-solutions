class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans=0;
       int size=0;
        for(int i=0;i<nums.length;i++){
                size=0;
             int counted=0;
            for(int j=i;j<nums.length;j++){
                size=j-i+1;
                if (nums[j] == target) counted++;
                if(2 * counted > size) ans++;
            }

        } 
        return ans;

    
    }
}