class Solution {
    public int wiggleMaxLength(int[] nums) {
        int count1=1;
        int prevDiff = 0;  
         
        for(int i=1;i<nums.length;i++){
            int currDiff = nums[i] - nums[i - 1];
           if(currDiff>0 && prevDiff<=0)count1++;
           if(currDiff<0 && prevDiff>=0)count1++;  
              if(currDiff!=0) prevDiff=currDiff;    }
             


 return count1;   }
}