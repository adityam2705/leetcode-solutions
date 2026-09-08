class Solution {
    public int countSpecialIntegers(int[] nums) {
        
      int[] freq=new int[101];
      int[] freq2=new int[101];
      int ans=0;
      int prev=-1;
      for(int i:nums){
          freq[i]++;}
          
      for(int i=0;i<nums.length;i++){
      
while(i<nums.length && (freq2[nums[i]]==0|| nums[i]==prev)){
          prev=nums[i];
          freq2[nums[i]]++;
          if(freq[nums[i]]==freq2[nums[i]]){
           ans++; }
         
          i++;
          }
       if(i<nums.length) prev=nums[i];
      
      }
 
      
      return ans;
    }
}