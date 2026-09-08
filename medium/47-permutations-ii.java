class Solution {
            List<List<Integer>> result = new ArrayList<>();
                    

    public List<List<Integer>> permuteUnique(int[] nums ) {

        solve(0,nums);
        return result;
    }
    void solve(int idx ,int[]nums){
           if(idx==nums.length){
             List<Integer> temp= new ArrayList<>();
                     
                 for(int x:nums){
                        temp.add(x);
                                   }
                               result.add(temp);
                                      return;
           }
                                        Set<Integer> st = new HashSet<>();

           for(int i=idx; i<nums.length;i++){

                 if(st.contains(nums[i])){
                          continue;
                              }
                               st.add(nums[i]);

                           swap(i,idx,nums);

                            solve (idx+1,nums);

                           swap(idx,i,nums);

                            }}
     void swap(int i , int j, int [] nums){
        int t;
        t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
        return;    }}
