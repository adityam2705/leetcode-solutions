class Solution {
    public int subarraysDivByK(int[] nums, int k) {
   
    int count=0;
    HashMap<Integer,Integer> map =new HashMap<>();
    int prev=0;
    map.put(0,1);

      for(int i=0;i<nums.length;i++){
        
        prev+=nums[i];
        int rem=((prev%k)+k)%k;;

        count+=map.getOrDefault(rem,0);
        map.put(rem,map.getOrDefault(rem,0)+1);
      }

return count;
    }
}