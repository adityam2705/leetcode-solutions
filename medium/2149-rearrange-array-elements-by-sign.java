class Solution {
    public int[] rearrangeArray(int[] nums) {
      int odd=1;  
   int even =0;                       
      int n = nums.length;            int[] res= new int[n];
        for(int a=0;a<n;a++){
            if(nums[a]>0){
                res[even]=nums[a];
                even+=2;
            }
            else {
                res[odd]=nums[a];
                odd+=2;
            }
            
        }
        return res;
    }
}