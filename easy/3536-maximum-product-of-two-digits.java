class Solution {
    public int maxProduct(int n) {
        int max1=0;
        int max2=0;
        int rem=0;

    while(n>0){
        rem=n%10;
        n=n/10;
        if(rem>max1){max2=max1;
            max1=rem;}
        else{max2=Math.max(max2,rem);}   }

       return max1*max2;
    }
}