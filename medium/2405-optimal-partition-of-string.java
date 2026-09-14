class Solution {
    public int partitionString(String s) {
        if(s=="")return 0;
         int count=1;
        int[] freq = new int[26];
      for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        if(freq[ch-'a']>=1){count++;
                Arrays.fill(freq,0);}
          freq[ch-'a']++;}      
      return count;    }
}