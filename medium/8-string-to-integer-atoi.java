class Solution {
    public int myAtoi(String s) {
        int x=0;
        long result=0;
        long j=1;
        int ck=0;
        int cl=0;
        for(int i =0;i<s.length();i++){
            
           
            if(ck>0 && (s.charAt(i)=='+' || s.charAt(i)=='-')){
                break;
            }
            if(  ck==0 && s.charAt(i)=='-' ){ck++;
                j=-1;
                continue;
            }
             if(Character.isAlphabetic(s.charAt(i))== true){
                break;
            }

            if(Character.isDigit(s.charAt(i))== true  ){
                x= s.charAt(i)-'0';
                  ck++;    
                
            result=  result*10+x;
              if(j*result<= Integer.MIN_VALUE){
                 return (int) j*Integer.MIN_VALUE;
         }
          if(j*result >= Integer.MAX_VALUE){
                return (int) j*Integer.MAX_VALUE;
          }
              System.out.println(result);
            continue;}
            if(s.charAt(i)=='+' ){ck++;
            continue;}
            if( ck==0 &&s.charAt(i)==' ')continue;
            break;
           
        } System.out.println(result);
         result = result*j;
       
          return (int) result;
    }
}