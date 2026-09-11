class Solution {
public:
    string reverseWords(string s) {
       
        int count=0;
    int i=0;
        int n=s.length();
         std::string answer;
        int j=n-1;
   std::reverse(s.begin(), s.end());
   for(int i=0;i<n;i++){
    std::string word="";
   while(i<n && s[i]!=' '){
    word+=s[i];
    i++;}
std::reverse(word.begin(), word.end());
if(word.length()>0){
 answer+=" "+ word;
}
   }
   return answer.substr(1); }
};