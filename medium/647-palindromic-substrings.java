class Solution {
    boolean[][] dp;
    public int countSubstrings(String s) {

        int count=0;
        
        dp=new boolean[s.length()][s.length()];

       for(int L=1;L<=s.length();L++){
         for(int i=0;i+L-1<s.length();i++){
            int j=i+L-1;
           
           if(i==j){dp[i][j]=true;}

           else if(i+1==j){dp[i][j]=(s.charAt(i)==s.charAt(j));}

           else{dp[i][j]=(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]);}
       
           if(dp[i][j])count++;
         }
       } 

    return count;
    }
}