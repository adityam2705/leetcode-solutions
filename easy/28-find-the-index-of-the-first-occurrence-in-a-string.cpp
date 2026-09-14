class Solution {
public:
    int strStr(string haystack, string needle) {
        int n=haystack.length();
        int x=needle.length();
        int i=0;
        int idx=0;
        int count=0;
        for(i=0;i<=(n-x);++i){
              if(haystack.substr(i,x)==needle){
                return i;

              }
            
        }
        return -1;
        
    }
};