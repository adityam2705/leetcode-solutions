class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
           List<Integer> temp = new ArrayList<>();
            backtrack(candidates,target,temp,0,0);
                return result;
            }
  void  backtrack(int[]candidates,int target,List<Integer> temp,int idx,int count){
                if(count>target){
                    return;
                }             
                if(count==target){
                    result.add(new ArrayList<>(temp));
                    return;}
        for(int i =idx;i<candidates.length;i++){
            temp.add(candidates[i]);
            count+=candidates[i];
            backtrack(candidates,target,temp,i,count);
            count-=candidates[i];
            temp.remove(temp.size()-1); }

    }
}