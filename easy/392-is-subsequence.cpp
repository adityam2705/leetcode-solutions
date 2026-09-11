class Solution {
public:
    bool isSubsequence(string s, string t) {
        int k=-1;
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=k+1;j<t.length();j++){
                if(s[i]==t[j]){
                   k=j;
                count++;
                break;}
            }
        }
        return (count==s.length()) ? true:false;
    }

};