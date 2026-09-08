class Solution {
    boolean[][]dp;
    public String longestPalindrome(String s) {
        
      int n=s.length();
      int len=0;
      String result="";
      dp=new boolean[n][n];
 
        for(int L=1;L<=n;L++){
          for(int i=0;i+L-1<n;i++){
            int j=i+L-1;
             
            if(i==j){dp[i][j]=true;}
              
            else if(i+1==j){dp[i][j]=(s.charAt(i)==s.charAt(j));}
             
            else{dp[i][j]=(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]);}

            if(dp[i][j]){
             if(j-i+1>len){
                len=j-i+1;
                result=s.substring(i,j+1); }}
            }
          }
       
    return  result; }
}