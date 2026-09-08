class Solution {
    public long sumAndMultiply(int n) {
        int mod=0;
        int sum=0;
        int num=0;
        int place=1;
    while(n>0){
        mod=n%10;
        sum+=mod;
         if(mod!=0) {
                num = mod*place+num;
                place*=10;
            }
        n/=10;}
  

    return (long)sum*num;
    }
}