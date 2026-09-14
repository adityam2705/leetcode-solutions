class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
     int count=0;

     for(int i=0;i<nums.length;i++){
        int even=0;
        int odd=0;
        for(int j=i;j<nums.length;j++){
            if(nums[j]%2==1){odd++;}
            else{even++;}
            if(odd>0 && (double)even/odd <=(double)a/b){
                count++;}
        }
     }

return count;
    }
}