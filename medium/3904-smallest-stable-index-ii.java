class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        int n=nums.length;

        int[] premax= new int[n];
        int[] sufmin= new int[n]; 

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int j=0;j<n;j++){
         max=Math.max(nums[j],max);
         premax[j]=max;}

        for(int j=n-1;j>=0;j--){
        min=Math.min(nums[j],min);
        sufmin[j]=min;}

        
      
      for(int i=0;i<n;i++){
        if(premax[i]-sufmin[i]<=k)return i;}      
   
    
    return -1;}
}