class Solution {
    public int largestInteger(int n, int s) {

  if(s==0)return 0;
       int i=9;
       int num=0;
       int sum=0;
  if(s>9*n)return -1;

  int limit=(int)Math.pow(10,n);

      while(sum!=s || num<limit){
    
        if(sum<s){num=num*10+i;
               sum+=i;}
          
        while(sum>s){
            num-=i;
            num=num/10;
            sum-=i;
            i--;}

        if(sum==s){
           System.out.println(num);
            num=num*10;
        }
      }

return num/10;
    }
}