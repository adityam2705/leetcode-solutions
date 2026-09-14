class Solution {
    int [][] dp;
    List<List<String>> result= new ArrayList<>();
    
    public List<List<String>> partition(String s) {
        
        dp=new int[s.length()][s.length()];

 
    for(int i=0;i<s.length();i++){dp[i][i]=1;}

    List<String>  curr= new ArrayList<>();

      for(int L=1; L<=s.length();L++){
        for(int i=0;i<s.length()-L+1;i++){
         
        int j=i+L-1;
         
        if(s.charAt(i)==s.charAt(j)){
            if(L<=2)dp[i][j]=1;
        
            else{
            dp[i][j]=dp[i+1][j-1];}
         }   
       }
     } 

    solve(0,s,curr);
    return result;
    }

   void solve(int i,String s,List<String> curr){

    if(i>=s.length()){
        result.add(new ArrayList<>(curr));
        return;}

    for(int j=i;j<s.length();j++){

       if(dp[i][j]==1){

        curr.add(s.substring(i,j+1));
        
        solve(j+1,s,curr);

        curr.remove(curr.size()-1);
       }
     }
   }
}