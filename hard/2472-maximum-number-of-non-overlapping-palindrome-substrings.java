class Solution {
    int[][] dp;
    public int maxPalindromes(String s, int k) {
  
    int n=s.length();
    dp=new int[n][n];
    int count=0;
   int start = 0;

   for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
       
    for(int j=0;j<n;j++){
      for(int i=start;i<=j-k+1;i++){

    if(ispal(i,j,s)){
       count++;
       
    start=j+1;
    break;}
      
      }
    }
    
    return count;
    }

   boolean ispal(int i,int j,String s){

    if(i>=j)return true; 
    
    if(dp[i][j]!=-1)return dp[i][j]==1?true:false;

    if(s.charAt(i)==s.charAt(j)){
       dp[i][j]= (ispal(i+1,j-1,s))?1:0;}
       else{
        dp[i][j]=0;}
 
      return (dp[i][j]==1);  

   }
}