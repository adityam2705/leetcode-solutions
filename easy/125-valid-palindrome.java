class Solution {
    public boolean isPalindrome(String s) {int count=0;
      s=  s.toLowerCase();
      s= s.replaceAll("[^a-zA-Z0-9]", "");
      int n =s.length();
      for(int i=0; i<n;i++){
        if(s.charAt(i)!=s.charAt(n-i-1)){
            count++; }}
            if(count>0){
                return false;
            }
            else{
                return true;
            }


      }
    }
