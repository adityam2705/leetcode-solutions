class Solution {
    List<List<Integer>> result = new ArrayList<>();
    int n;
    public List<List<Integer>> permute(int[] nums) {
        n=nums.length;
        solve(0,nums);
        return result;
    }
    void solve(int j ,int[] nums){
        if(j==nums.length){
            List<Integer> temp= new ArrayList<>();
            for(int x:nums){
                temp.add(x);
            }
            result.add(temp);
            return;
        }
        for(int i=j;i<nums.length;i++){
        swap(j,i,nums);
        solve(j+1,nums);
        swap(i,j,nums);
                     }   }
    void swap(int i , int j, int [] nums){
        int t;
        t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
        return;
    }
}