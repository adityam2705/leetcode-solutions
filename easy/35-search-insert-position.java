class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        int mid=(start+end)/2;
        while(start<=end){
           mid=start+(end-start)/2;
            
            if(target>nums[mid]){
                start=mid+1;}
          
          else{
            end=mid-1;
          }}
       
            

        return start;
    }
}