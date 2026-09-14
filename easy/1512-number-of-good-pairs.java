class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int [] freq= new int[101];
        int ans=0;
        for(int i=0;i<nums.length;i++){
           freq[nums[i]]++;}

        for(int i=0;i<101;i++){
          ans+=(freq[i]*(freq[i]-1))/2;}

         return ans;
    }
}