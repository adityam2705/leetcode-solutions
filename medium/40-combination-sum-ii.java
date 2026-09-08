class Solution {
    List<List<Integer>> result= new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp= new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,temp,target,0,0);
        return result; }
    void backtrack(int[]candidates, List<Integer> temp ,int target , int count, int idx){
         if(count>target){
            return;}
        if(count==target){
            result.add(new ArrayList<>(temp));        
            return;}

       for(int i= idx; i<candidates.length;i++){
        if(i > idx && candidates[i] == candidates[i-1]) continue; // skip duplicates
            if(candidates[i]>target) break;
            temp.add(candidates[i]);
            count+=candidates[i];
            backtrack(candidates,temp,target,count,i+1);
            count-=candidates[i];
            temp.remove(temp.size()-1);  
       } 



    }
}