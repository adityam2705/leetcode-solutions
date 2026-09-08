class Solution {
    public String breakPalindrome(String palindrome) {
        int n=palindrome.length();
        if(n==1)return "";
        int count=0;
        int end=0;
        end=n/2;
        StringBuilder sb = new StringBuilder(palindrome);
    for(int i=0;i<end;i++){
        char ch=sb.charAt(i);
          if(ch=='a'){ count++;
            continue;}
          else{sb.setCharAt(i,'a');
               break;  }   }

        if(count==end)sb.setCharAt(n-1,'b');
        return sb.toString();
    
    

    }
}