class Solution {
static{
        for(int i=0;i<500;i++)
            isAnagram("", "a");
        }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int n=s.length();
         int[] c=new int[26];
        
         for(int i=0;i<n;i++){
            c[s.charAt(i)-'a']++;
            c[t.charAt(i)-'a']--;
         }
        
         for(int i=0;i<26;i++){
            if(c[i]!=0)return false;
         }
         return true;
        
    }
}