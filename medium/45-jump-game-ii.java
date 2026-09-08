class Solution {
    public int jump(int[] nums) {int i=0;
    int l=0;
        int r=0;
      int n=nums.length;
      int count=0;
      while(r<n-1){int far=0;
      for(i=l;i<=r;i++){
              far=Math.max(i+nums[i],far);
                   }
              count++;
              l=r+1;
              r=far;
      }
   
   return count;}
}