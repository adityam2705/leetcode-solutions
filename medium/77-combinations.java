class Solution {
    public List<List<Integer>> combine(int n, int k) {
            List<Integer> curr = new ArrayList<>();
        comb(1,n,k,curr);
        return result;
    }
    List<List<Integer>> result = new ArrayList<>();
    void comb(int idx ,int n ,int k, List<Integer> curr){
      if(curr.size()==k){
    List<Integer> temp = new ArrayList<>(curr);
        result.add(temp);
        return;}
      if(idx>n){
        return;}
    for(int i=idx;i<=n;i++){
       curr.add(i);
       comb(i+1,n,k,curr);
       curr.remove(curr.size()-1);}

    }

    }
