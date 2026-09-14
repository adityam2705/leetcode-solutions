class Solution {
    public int findGCD(int[] nums) {
        int a=1000;
        int b=1;
   for(int i=0;i<nums.length;i++){
       a=Math.min(a,nums[i]);
       b=Math.max(b,nums[i]);}

      while(b!=0){
        int temp = b;
        b=a%b;
        a=temp;
   }
    return a;      
    }
}