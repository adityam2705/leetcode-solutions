class Solution {
       int[][] dp;
    public String shortestCommonSupersequence(String str1, String str2) {
         
         int m = str1.length();
        int n = str2.length();

        dp=new int[m + 1][n + 1];

        for(int i=0;i<=m;i++){
            Arrays.fill(dp[i], -1);}

      solve(str1,str2,0,0);
      StringBuilder ans = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i<m && j<n) {

           if(str1.charAt(i)==str2.charAt(j)){
                ans.append(str1.charAt(i));
                i++;
                j++;}

         else if(solve(str1, str2, i + 1, j)<=solve(str1, str2, i, j + 1)){
                ans.append(str1.charAt(i));
                i++;}
            else{
                ans.append(str2.charAt(j));
                j++;}
        }

        while(i<m){
            ans.append(str1.charAt(i));
            i++;}

        while(j<n){
            ans.append(str2.charAt(j));
            j++;}

        return ans.toString();
    }

    int solve(String str1,String str2,int i, int j){

        if(i==str1.length()){
            return str2.length() - j;}

        if(j==str2.length()){
            return str1.length() - i;}
     
     if(str1.charAt(i)==str2.charAt(j)){
        return dp[i][j] = 1+ solve(str1,str2,i+1,j+1); }

        if(dp[i][j] != -1){
            return dp[i][j];}

    else{
        return dp[i][j] = 1+ Math.min(solve(str1,str2,i+1,j),solve(str1,str2,i,j+1));}
    

    }
}