class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int r=0;
        int l=0;
        int count=0;
       int maxl=0;
        while(r<n){
            if(nums[r]==0){count++;}
                if(count>k){
                    if(nums[l]==0){count--;}
                      l++;}
                      if(count<=k){
                maxl=Math.max(r-l+1,maxl);
                }
                r++;
                
                    
                }
            
        
        return maxl;
        
    }
}