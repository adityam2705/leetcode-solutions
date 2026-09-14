class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff=Integer.MAX_VALUE;
        int closestSum = 0;
      
        int sum=0;
        Arrays.sort(nums);

        if(nums.length==3){
            return nums[0]+nums[1]+nums[2];
        }

        for(int i=0;i<nums.length-2;i++){
             int k=nums.length-1;
            int j=i+1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)<=diff){
                     diff = Math.abs(sum - target);
                     closestSum = sum;}
                if(sum>target){
                    k--;
                }
                else if(sum<target){
                    j++;
                    
                   }
                   else{
                    return sum;
                   }
                }

            }
        return closestSum;
    }
}