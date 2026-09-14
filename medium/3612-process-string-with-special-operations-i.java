class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        char b;
     for(int i=0;i<s.length();i++){
            b= s.charAt(i);  
            if(b=='#'){
                result.append(result.toString());
            } 
            else if(b=='*'){
                if(result.length()>0){
            result= result.deleteCharAt(result.length()-1);}
            }
            else if(b=='%' ){
                result.reverse();
            }  
             else{
                result.append(b);
            }
             }
            return result.toString();
    }
}