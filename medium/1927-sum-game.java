class Solution {
    public boolean sumGame(String num) {
        
        int mid=num.length()/2;
        int left=0;
        int right=0;
        int countl=0;
        int countr=0;

      for(int i=0;i<mid;i++){
            if(num.charAt(i)=='?'){left++;}
            else{countl+=num.charAt(i)-'0';}
            }

      for(int i=mid;i<num.length();i++){
           if(num.charAt(i)=='?')right++;
           else{countr+=num.charAt(i)-'0';}}
           
                  
        if(left==right)return countl!=countr;
        
        if((right-left)*9!=(countl-countr)*2)return true;

   return false;
    }
}