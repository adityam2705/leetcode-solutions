class Solution {
    public String smallestPalindrome(String s) {
        
        int mid=s.length()/2 ;
        StringBuilder sb= new StringBuilder(s);   
     int[] freq = new int[26];

       for(char c:s.toCharArray()){freq[c - 'a']++;}

        int j=0;
        int n=s.length()-1;
   
       for(int i=0;i<26;i++){
            char curr=(char)('a'+i);
             int freqn=freq[i];

            while(freqn>1){
                
             sb.setCharAt(n-j,curr);
             sb.setCharAt(j++,curr);
             
             freqn=freqn-2; }                       } 

return sb.toString();
    }
}