class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
   int n=nums.length;    
   int left=0;
   int right=0;
   int max=Integer.MIN_VALUE;
   HashMap<Integer,Integer> map = new HashMap<>();
   
     while(left<n && right<n){
         
 map. put(nums[right],map.getOrDefault(nums[right],0)+1);
         
         while(map.get(nums[right])>k && left<n){
             map.put(nums[left],map.get(nums[left])-1);
      left++;
         }
         
         max=Math.max(right-left+1, max);
         right++;
     }
     
     return max;
    }
    
    
}