class Solution {
    String result= "";
    public String longestSubsequenceRepeatedK(String s, int k) {
        
        int [] freq = new int[26];
        int[] required= new int[26];
        for(int i=0;i<s.length();i++){freq[s.charAt(i)-'a']++;}   
          
         for(int i=0;i<26;i++){
            if(freq[i] >=k){
                required[i]=freq[i]/k;}}

        int maxlen=s.length()/k;

        StringBuilder sb=new StringBuilder();
        backtrack(s,sb,required,k,maxlen,maxlen);
   
   return result;
        
    }

    void backtrack(String s,StringBuilder curr,int[] required,int k,int maxlen,int remaining){
               
   if(curr.length()>maxlen)return;

  if(curr.length() + remaining <= result.length()) return;

   if(curr.length() > result.length() &&issub(curr,s,k)){
     result=curr.toString();    }     


    for(int i=25;i>=0;i--){
        if(required[i] > 0){
          char ch=(char)(i+'a');
          curr.append(ch);
          required[i]--;
          backtrack(s,curr,required,k,maxlen,remaining - 1);
          curr.deleteCharAt(curr.length()-1);
          required[i]++;
        }
    }

    }

    boolean issub(StringBuilder curr,String s,int k){
          int i=0;
          int j=0;
          int L=curr.length();
          int r=s.length();

          while(i<r && j<k*L){
            if(s.charAt(i)==curr.charAt(j%L))j++;
            i++; }

          return j==k*L;}
}