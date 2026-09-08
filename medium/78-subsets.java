class Solution {
     List<Integer> demo = new ArrayList<>();;
    public List<List<Integer>> subsets(int[] nums) {
     solve(0,nums,demo);
     return result;
    }
    List<List<Integer>> result = new ArrayList<>();
    void solve(int i, int[] nums, List<Integer> temp){
    if(i>nums.length-1){
        result.add(new ArrayList<>(temp));
        return;  }
        temp.add(nums[i]);
        solve(i+1,nums,temp);
        temp.remove(temp.size()-1);
        solve(i+1,nums,temp);

   }
}