class Solution {
    public int smallestIndex(int[] nums) {
     
   for(int i=0;i<nums.length;i++){
         
      int check=solve(nums[i]);
         
       if(check==i)return i;
     }
     
     return -1;
    }
    
   int solve(int num){
       
       int ans=0;
 
       while(num>0){
           
          ans+=num%10;
          num=num/10;
    
       }
       
      return ans; 
   }
}