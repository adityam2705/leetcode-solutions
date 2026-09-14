class Solution {
    public double minimumAverage(int[] nums) {
      
      int min=Integer.MAX_VALUE;
      int i=0;
      int j=nums.length-1;
      Arrays.sort(nums);

      while(i<j){
          min=Math.min(min,nums[i]+nums[j]);
            i++;
            j--; }     

      return (double)min/2;
    }
}