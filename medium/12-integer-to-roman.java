class Solution {
    public String intToRoman(int num) {
        StringBuilder sb =new StringBuilder();
       process(sb, 'M','*','*', num/1000);
        num=num%1000;
      process(sb,'C' ,'M','D',num/100);
        num=num%100;
        process(sb,'X','C','L',num/10);
        num=num%10;
      process(sb,'I','X','V',num);

      return sb.toString();
    }
      void process(StringBuilder sb,char m,char Ma, char middle, int val ){
            if(val<=3){
            for(int i=0;i<val;i++){
             sb.append(m);   
            }}
            else if(val==4){
                sb.append(m);
                sb.append(middle);
            }
            else if(val==5){
                sb.append(middle);
            }
            else if(val<=8){
                sb.append(middle);
                for(int i=6;i<=val;i++){
                sb.append(m);
                }}
            else if(val==9){
                sb.append(m);
                sb.append(Ma);
            }
            
        }

        
    
}