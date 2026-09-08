class Solution {
    public boolean uniformArray(int[] nums1) {
       
       int n=nums1.length;
       int odd=0;
       int even=0;
       int min=Integer.MAX_VALUE;
       
     for(int i=0;i<n;i++){

    min=Math.min(min,nums1[i]);
 if(nums1[i]%2==0){even++;}
     else{odd++;}   }
     
  if(odd==n ||even==n)return true;
  
 if(min%2==0 && odd>0)return false;
    
     
    return true;
   }
}