class Solution {
    int [][]dp;
    int []t;
    public int minCut(String s) {
        
        dp=new int[s.length()][s.length()];
        t=new int[s.length()];

        for(int i=0;i<s.length();i++){dp[i][i]=1;}
    
        Arrays.fill(t,Integer.MAX_VALUE);

      for(int L=1;L<=s.length();L++){
        for(int i=0;i+L-1<s.length();i++){
     
            int j=i+L-1;

        if(s.charAt(i)==s.charAt(j)){
            if(L<=2)dp[i][j]=1;
        
        else{dp[i][j]=dp[i+1][j-1];} }

        }
      }


    for(int i=0;i<s.length();i++){

        if(dp[0][i]==1){t[i]=0;}
 
        else{
        for(int k=0;k<i;k++){
            if(dp[k+1][i]==1 && 1+t[k]<t[i]){
                t[i]=1+t[k];}}}
    }

     return t[s.length()-1];
    }
}