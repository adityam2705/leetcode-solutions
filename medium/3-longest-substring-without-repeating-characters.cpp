class Solution {
public:
    int lengthOfLongestSubstring(string s) {int b=0;
         int n=s.length();
         int length=0;
   int hash[256];
   for(int i = 0; i < 256; i++) {
            hash[i] = -1;
        }
    int r=0;
    int maxl=0;
    int l=0;
    while(r<n){
        if(hash[s[r]]!=-1){
            if(hash[s[r]]>=l){
                l=hash[s[r]]+1;
            }
        }
        length=r-l+1;
        maxl=max(maxl,length);
        hash[s[r]]=r;
        r++;
            }
            return maxl;
        }
    };
        
        