class Solution {
    public int maxDigitRange(int[] nums) {
     int[] diff = new int[nums.length];
     int max=0;
     int sum=0;

      for(int i=0;i<nums.length;i++){ 

        diff[i]=diffget(nums[i]);  
        max=Math.max(max,diff[i]);}
     
     for(int i=0;i<diff.length;i++){
        if(max==diff[i])sum+=nums[i];}

        return sum;
     
    }

    int diffget(int num){
    int rem=0;
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;

     while(num>0){
        rem=num%10;
        num=num/10;

           max=Math.max(rem,max);
           min=Math.min(rem,min);}
     
    return max-min;

    }
}