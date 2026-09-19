class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    int prev=0;
    int count=0;

    for(int i=0;i<nums.length;i++){
    if(nums[i]%2==1)prev++;

    int diff=prev-k;

    count+=map.getOrDefault(diff,0);
    map.put(prev,map.getOrDefault(prev,0)+1);}

    return count;
    }
}