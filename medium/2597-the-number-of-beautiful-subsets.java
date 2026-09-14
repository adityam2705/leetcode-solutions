class Solution { 
    int count=0;
    public int beautifulSubsets(int[] nums, int k) {
        List<Integer> temp =new ArrayList<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        backtrack(nums,k,0,temp,freq);
        return count;  }

     void backtrack(int[]nums,int k,int idx, List<Integer> temp,HashMap<Integer,Integer> freq){

            if(temp.size()>0) count++;

       for(int i=idx;i<nums.length;i++){
        
  if(freq.containsKey(nums[i]-k)|| freq.containsKey(nums[i]+k)) continue;
             freq.put( nums[i],freq.getOrDefault(nums[i],0)+1);
             temp.add(nums[i]);
            backtrack(nums,k,i+1,temp,freq);
            freq.put( nums[i],freq.get(nums[i])-1);
         if(freq.get(nums[i]) == 0){freq.remove(nums[i]);}        
          temp.remove(temp.size()-1);
       }
     }
}