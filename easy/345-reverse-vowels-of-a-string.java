class Solution {
    public String reverseVowels(String s) {
     StringBuilder sb= new StringBuilder(s);
        int left=0;
        int right=s.length()-1;
     while(left<right){
    char first=sb.charAt(left);
    char last=sb.charAt(right);
   boolean fleft=isvowel(first);
   boolean lright=isvowel(last);
   if(fleft==true && lright==true){swap(left,right,sb);
   left++;
   right--; }
   else if(fleft==true &&
   lright==false){
       right--; }
   else if(fleft== false && lright== true){left++;}
    else{
        left++;
        right--; 
    }
     }
     return sb.toString();
    }
    void swap(int left, int right,StringBuilder s){ char temp;
      temp=s.charAt(left);
 s.setCharAt(left, s.charAt(right));
    s.setCharAt(right, temp);
}
    
   boolean isvowel(char c){
      
       if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')return true;
       
       return false;
   }
}