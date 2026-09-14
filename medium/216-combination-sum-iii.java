class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
             List<Integer> temp = new ArrayList<>();
             backtrack(k,n,temp,1,0);
             return result;
    }
   void backtrack(int length, int target,List<Integer> temp,int idx,int count ){
          

           if(temp.size() > length) return;

           if(count>target){
            return;}

           if(count==target){
               if(temp.size()==length) result.add(new ArrayList<>(temp));
                     return;}

        for(int i=idx;i<10;i++){

            if(i>target)break;
             count+=i;
             if(count>target) break; 
             temp.add(i);
             backtrack(length,target,temp,i+1,count);
             count-=i;
             temp.remove(temp.size()-1);}   
             } 
               }