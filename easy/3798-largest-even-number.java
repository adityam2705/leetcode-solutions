class Solution {
    public String largestEven(String s) { 
      
     while((int)s.charAt(s.length()-1)%2!=0){
s = s.substring(0, s.length() - 1);
      if(s.isEmpty()){return "";}
        }
        
    return s;
    }
}