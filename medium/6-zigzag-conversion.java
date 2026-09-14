class Solution {
    public String convert(String s, int numRows) {
       if(numRows==1){
        return s;
       }
     StringBuilder sb= new StringBuilder();
        for(int i=0;i<numRows;i++){
       int idx=i;
       int dnorth=2*i;
       int dsouth=2*(numRows-i-1);
       boolean gosouth =true;
       while(idx<s.length()){
        sb.append(s.charAt(idx));
        if(i==0){
            idx+=dsouth;
        }
        else if(i==numRows-1){
            idx+=dnorth;
        }
        else{
        if(gosouth){
            idx+=dsouth;
        }
        else{
            idx+=dnorth;
        }
         gosouth=!gosouth;

       }}
    }
    return sb.toString(); } 
}