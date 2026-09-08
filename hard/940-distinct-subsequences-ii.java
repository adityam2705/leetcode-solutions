class Solution {
    int mod=1000000007;
   int[] dp;
   int[] prev;
    public int distinctSubseqII(String s) {

    int n=s.length();
    
    dp=new int[n+1];
    Arrays.fill(dp,-1);

    prev=new int[n+1];
    int[] lastseen= new int[26];
     
    for(int i=1;i<=n;i++){
       int idx=s.charAt(i-1)-'a';
       prev[i]=lastseen[idx];
       lastseen[idx]=i; } 

    return (solve(n)-1+mod)%mod;
    }

    int solve(int n){
  
    if(n==0)return 1;

    if(dp[n]!=-1)return dp[n];

    int total = (2*solve(n-1))%mod;
  
    if(prev[n]!=0){
    int duplicate=solve(prev[n]-1);

    total=(total-duplicate+mod)%mod;}

    return dp[n]=total;
    }
}