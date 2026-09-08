class Solution {
    public int maximumLengthSubstring(String s) {
        
 int[] freq = new int[26];
     int max=Integer.MIN_VALUE;
     int left=0;
     
     
for(int right=0;right<s.length();right++){
     
     char ch= s.charAt(right);
     freq[ch-'a']++;
     
     while(freq[ch-'a']>2){
         
         char ch2=s.charAt(left);
         freq[ch2-'a']--;
         left++;
     }
     
     max=Math.max(max,right-left+1);

 }
         
    return max;
         
         
     
        
    }
}