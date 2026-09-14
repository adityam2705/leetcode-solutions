class Solution {
    int[] dp;
    int n;
    public int longestStrChain(String[] words) {
        
    Arrays.sort(words,(a,b)->Integer.compare(a.length(),b.length()));

        n=words.length;
        int max=1;
        dp =new int[n];     
        Arrays.fill(dp,1);

       for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
           if(check(j,i,words)){
              dp[i]=Math.max(dp[i],dp[j]+1); }

         max=Math.max(max,dp[i]);}}

     return max;
        }

    boolean check(int a,int b,String[] words ){

        String s=words[a];
        String t=words[b];
        int i = 0;
        int j = 0;

    if(t.length() != s.length() + 1){ return false;}

        while(i<s.length() && j<t.length()) {
            if(s.charAt(i)==t.charAt(j)) {
                i++;
            }
            j++;
        }
         
        return i == s.length();
    }
}