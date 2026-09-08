class Solution {
       List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
           backtrack(nums,temp,0);
                    return result;    }
      void backtrack(int[]nums,List<Integer> temp, int idx){
              result.add(new ArrayList<>(temp));

            for(int i=idx;i<nums.length;i++){
                if(i>idx && nums[i]==nums[i-1]) continue;
                  temp.add(nums[i]);
                  backtrack(nums,temp,i+1);
                  temp.remove(temp.size()-1);  }


      }     
}