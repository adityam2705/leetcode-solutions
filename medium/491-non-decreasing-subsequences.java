class Solution {
    int n;
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> findSubsequences(int[] nums) {
        n=nums.length;
        List<Integer> curr= new ArrayList<>();
        check(nums,0,curr);
        return result;
    }
    void check(int[]nums,int j, List<Integer> curr){
       
         if(curr.size()>1){
         result.add(new ArrayList<>(curr));}
     
       HashSet<Integer> st = new HashSet<>();

       for(int i=j;i<n;i++){
       if((curr.isEmpty() || nums[i] >= curr.get(curr.size() - 1))&& !st.contains(nums[i])){        
                curr.add(nums[i]);
                check(nums,i+1,curr);
                curr.remove(curr.size()-1);
            }
            st.add(nums[i]);

       }
    }
}