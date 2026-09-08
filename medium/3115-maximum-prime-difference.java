class Solution {
    public int maximumPrimeDifference(int[] nums) {
         int i=0;
         int j=nums.length-1;

        while(i<j){
          boolean one = isprime(nums[i]);
          boolean two = isprime(nums[j]);
           
           if(one==true && two == true)return j-i;

           if(!one)i++;
           if(!two)j--;
         }  

        return 0; 
    }

    boolean isprime(int a){
      if( a==2|| a==3 || a==5|| a==7|| a==11|| a==13|| a==17|| a==19|| a==23|| a==29|| a==31|| a==37|| a==41|| a==43|| a==47|| a==53|| a==59|| a==61|| a==67|| a==71|| a==73|| a==79|| a==83|| a==89|| a==97){
        return true;
      }

      return false;
    }
}