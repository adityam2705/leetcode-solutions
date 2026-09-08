class Solution {
    public boolean checkDivisibility(int n) {

        int num=n;        
        int rem1=0;
        int rem2=1;

        while(n>0){
           
           rem1+=n%10;
           rem2*=n%10;

           n=n/10;}      
       
     return (num%(rem1+rem2)==0)?true:false;
    }
}