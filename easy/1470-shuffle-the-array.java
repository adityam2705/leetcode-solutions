class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=n;
        int k=0;
        int i=0;
        int[] result = new int[nums.length];

        while(k<2*n){
           result[k++]=nums[i++];
           result[k++]=nums[j++];
        }
    
    return result;}
}