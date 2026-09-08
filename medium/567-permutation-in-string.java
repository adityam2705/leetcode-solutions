class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int[] need = new int[26];
        int count=0;

        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
             freq[ch-'a']++;   }

            int left=0;

        for(int right=0;right<s2.length();right++){
            
               char lch= s2.charAt(right);
                need[lch-'a']++; 
               
            while(right-left+1>s1.length()){
                    char rch=s2.charAt(left);
                    need[rch-'a']--;
                    left++; }
            
            if(right-left+1==s1.length()){
                 if (Arrays.equals(freq, need)) return true;}
                                     }
     return false;        
    } 
}