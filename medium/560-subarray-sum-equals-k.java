class Solution {
    public int subarraySum(int[] nums, int k) {

    int ans=0;
    int prev=0;
   
    HashMap<Integer,Integer> map=new HashMap<>();
    prev=0;
    map.put(0,1);
    
    for(int j=0;j<nums.length;j++){
        prev+=nums[j];
        
        int diff=prev-k;
        ans+=map.getOrDefault(diff,0);
        map.put(prev,map.getOrDefault(prev,0)+1);
    }

     
    
    return ans;
    }
}