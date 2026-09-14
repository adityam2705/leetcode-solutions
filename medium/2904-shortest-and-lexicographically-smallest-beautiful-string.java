class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int ones=0;
        int len=Integer.MAX_VALUE;
        String result="";
         int j=0;

       for(int i=0;i<s.length();i++){
         
          if(s.charAt(i)=='1')ones++;
            
          while(ones>k && j<s.length()){
            if(s.charAt(j)=='1')ones--;
            j++; }
          
          if(ones==k){
            while(s.charAt(j)=='0')j++;

            String curr = s.substring(j, i + 1);
            if(i-j<len ||(i-j == len && curr.toString().compareTo(result)<0)){
                  len=i-j;
                  result=curr.toString();}}                 
                                                        }


 return result;   }
}