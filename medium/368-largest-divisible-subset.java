class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {

     List<Integer> result= new ArrayList<>();

     Arrays.sort(nums);
     int n=nums.length;
     int max=1;

     int [] dp= new int[n+1];
     Arrays.fill(dp,1);

     int [] prev=new int[n];
     Arrays.fill(prev,-1);

     int lastchosen=0;
     int maxlen=1;

     for(int i=0;i<n;i++){
       for(int j=0;j<i;j++){
        
        if(nums[i]%nums[j]==0)

        if(dp[i]<dp[j]+1){
         dp[i]=dp[j]+1;
         prev[i]=j;  }

       if(dp[i]>max){
          max=dp[i];
          lastchosen=i;}
     }}

     while(lastchosen!=-1){

        result.add(nums[lastchosen]);
        lastchosen=prev[lastchosen];
     }

return result;
    }
}