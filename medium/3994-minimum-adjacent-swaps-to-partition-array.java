class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
       long zeroes=0;
       long ones=0;
       long swap=0;
       long MOD = 1_000_000_007;
      
        for(int i=0;i<nums.length;i++){
            if(nums[i]>b){nums[i]=2;}
           else if(nums[i]>=a && nums[i]<=b){ nums[i]=1; }
           else {nums[i]=0;}
        }
            
        for(int i=nums.length-1;i>=0;i--){
           if(nums[i]==0){zeroes++;}
           if(nums[i]==1){
            swap+=zeroes;
             ones++;}
          if(nums[i]==2)
           swap+=zeroes+ones;}

     return  (int)(swap%MOD);
    }
}