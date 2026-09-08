class Solution {
    public int largestInteger(int[] nums, int k) {
      int max=Integer.MIN_VALUE;
      
 if(k==nums.length){
     
  for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
     }
     return max;
 }

      HashMap<Integer,Integer> map=new HashMap<>();
  
  for(int i=0;i<nums.length;i++){ map.put(nums[i],map.getOrDefault(nums[i],0)+1);} 
  
int lastp=map.get(nums[nums.length-1]);
 
 int firstp=map.get(nums[0]);
  
  if(1<k && k<nums.length){
      
      
 if(firstp==1 && (nums[0]>nums[nums.length-1]||lastp>1))return nums[0];
  
if((nums[0]<nums[nums.length-1]|| firstp>1)&& lastp==1) return nums[nums.length-1];

 return -1;}
  
   
  for(int i=0;i<nums.length;i++){
    if(map.get(nums[i])==1 && nums[i]>max){
        max=nums[i];
    }    
  }
  
if(max==Integer.MIN_VALUE)return -1;
   
  return max;
    }
}