class Solution {
    public int maxArea(int[] height) {
        int n=height.length-1;
        int max=0;
        int r=n;
        for(int l=0;l<r;l++){
            if(height[l]>=height[r]){
                max=Math.max(max,height[r]*(r-l));
                r--;
                l--;
                }
                else{
                 max=Math.max(max,height[l]*(r-l));  
                  }
                
    }return max;
}}