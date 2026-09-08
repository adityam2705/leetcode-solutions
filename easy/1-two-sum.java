class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
    int[] arr=new int[2];
    for(int j=0;j<nums.length;j++){
    for(int i=j+1;i<nums.length;i++){
        sum=nums[i]+nums[j];
            if(sum==target ){
            arr[0]=i;
            arr[1]=j;
            return arr;
            }
    
    }}
       return arr;
    }
}