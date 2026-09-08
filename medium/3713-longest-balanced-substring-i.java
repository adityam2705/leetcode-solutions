class Solution {
    public int longestBalanced(String s) {
    int ans=0;
for(int i=0;i<s.length();i++){
int[] freq= new int[26];
int maxfreq=0;
int distinct=0;
 int len=0;
for(int j=i;j<s.length();j++){
 int idx= s.charAt(j)-'a';
  if(freq[idx]==0){distinct++;}
 freq[idx]++;
maxfreq=Math.max(maxfreq,freq[idx]);
 len=j-i+1;
if(len==maxfreq*distinct){
ans=Math.max(ans,len);
}}
} return ans;
        
    }
}