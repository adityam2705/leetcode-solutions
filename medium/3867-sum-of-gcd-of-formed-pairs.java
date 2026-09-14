class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[]prefixgcd= new int[n];
        int max=1;

        for(int i=0;i<n;i++){
           max=Math.max(max,nums[i]);
           prefixgcd[i]=gcd(nums[i],max);}

           Arrays.sort(prefixgcd);

           long sum=0;
           int i=0;
           int j=n-1;
           while(i<j){
             sum+=(long)gcd(prefixgcd[i++],prefixgcd[j--]);
           }
   return sum;
    }

 int gcd(int small,int big){ //eulid way
    if (big == 0) return small;
    return gcd(big, small% big);}
}

