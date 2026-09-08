class Solution {
        String result="";

    public String lexGreaterPermutation(String s, String target) {
        
        int[] freq= new int[26];
        StringBuilder curr= new StringBuilder();

        for(int i=0;i<s.length();i++)freq[s.charAt(i)-'a']++;
    
      solve(curr,freq,target,0,false);
      return result;
    }

    boolean solve(StringBuilder curr, int[] freq, String target,int i, boolean greater){

          if(i==target.length()){
            if(greater){
                result=curr.toString();
                return true;  }
            return false;  }

       for(char ch='a';ch<='z';ch++){ 
            if(freq[ch-'a']==0)continue;

            if(greater==false && ch<target.charAt(i))continue;

            curr.append(ch);
            freq[ch-'a']--;

        boolean isgreater = greater || ch>target.charAt(i);

        if(solve(curr,freq,target,i+1,isgreater))return true;

          curr.deleteCharAt(curr.length()-1);
           freq[ch-'a']++;}
        return false; }
    }
   


