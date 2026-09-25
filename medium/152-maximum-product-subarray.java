class Solution {
    public int maxProduct(int[] nums) {
        
       
       int maxEnding = nums[0];
       int minEnding = nums[0];
       int ans = nums[0];

    for(int i=1;i<nums.length;i++){
                  
      int x=nums[i];

      int newMax=Math.max(x,Math.max(x*maxEnding,x*minEnding));
      int newMin=Math.min(x,Math.min(x*maxEnding,x*minEnding));
       ans=Math.max(ans,newMax);

       maxEnding=newMax;
       minEnding=newMin;}


    return ans;
    }
}