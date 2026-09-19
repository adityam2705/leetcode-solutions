class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

    HashMap<Integer,Integer> map = new HashMap<>();
    int prev=0;
    int count=0;
    map.put(0,1);

    for(int i=0;i<nums.length;i++){
    prev+=nums[i];
    int diff=prev-goal;
      
    count+=map.getOrDefault(diff,0);
    map.put(prev,map.getOrDefault(prev,0)+1); }

    return count;


    }
}