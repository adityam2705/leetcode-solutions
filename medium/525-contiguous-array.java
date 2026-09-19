class Solution {
    public int findMaxLength(int[] nums) {
        
    HashMap<Integer,Integer> map = new HashMap<>();
    int curr=0;
    int ans=0;
    map.put(0,-1);

    for(int i=0;i<nums.length;i++){
       if(nums[i]==0){curr--;}
        
        else{curr++;}
          
        if(!map.containsKey(curr)){map.put(curr,i);}
        
        ans=Math.max(ans,i-map.get(curr));    
    }

   return ans;
    }
}