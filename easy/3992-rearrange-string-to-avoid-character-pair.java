class Solution {
    public String rearrangeString(String s, char x, char y) {
     StringBuilder sb= new StringBuilder(s);
       
       int j=0;
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)==y){
            char temp=sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
             sb.setCharAt(j, temp);
            j++;}
     }
    return sb.toString();}
}