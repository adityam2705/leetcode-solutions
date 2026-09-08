class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        while(j<nums.length){
            sum+=nums[j];

            if(j-i+1>k){
                sum-=nums[i];
                i++;}
        
            if(j-i+1==k){
               System.out.println(sum);
               max= Math.max(max,sum);}
            
            j++;
        }
        return (double)max/k;
    }
}