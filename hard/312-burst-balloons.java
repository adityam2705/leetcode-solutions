class Solution {
    int[][] dp;
    public int maxCoins(int[] nums) {
    
    int n=nums.length;
    int[] arr=new int[n + 2];

    arr[0]=arr[n + 1]=1;

    for(int i=0;i<n;i++)arr[i + 1]=nums[i];

    dp=new int[n+2][n+2];

    for(int[] row:dp)Arrays.fill(row, -1);

   return solve(1,n,arr);  
    }

    int solve(int i,int j,int[] nums){

    if(i>j)return 0;

    if(dp[i][j]!=-1)return dp[i][j];

    int max=0;

   for(int ind=i;ind<=j;ind++){

int cost=nums[i-1]*nums[ind]*nums[j+1]+solve(i,ind-1,nums)+solve(ind+1,j,nums);

    max=Math.max(cost,max);}

    return dp[i][j]=max;}
}