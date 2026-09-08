class Solution {
    public int missingInteger(int[] nums) {
        
        int max=0;
        int sum=nums[0];
        HashSet<Integer> set= new HashSet<>();
        set.add(nums[0]);
        int j=1;  
           
         while(j<nums.length && nums[j]==nums[j-1]+1){
            sum+=nums[j]; 
            set.add(nums[j]);
            j++;
            }

      for(int i=j;i<nums.length;i++){set.add(nums[i]);}
            
    
    int result=sum;

     
    
     while(true){
        if(!set.contains(result)){
            return result;
        }
         result++; }

    }
}