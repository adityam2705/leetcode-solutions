class Solution {
    public int minOperations(int[] nums, int x) {

    int n=nums.length;
    int i=0;
    int j=0;
    int sum=0;
    int total=0;
    int max=-1;

    if(x<0)return -1;

    for(int k=0;k<nums.length;k++)total+=nums[k];
     
     x=total-x;

    while(j<n && i<n){         
        sum+=nums[j];
        j++;

    while(sum>x && i<n){
        sum-=nums[i];
        i++;}

      if(sum==x){
        max=Math.max(max,j-i);}
        
       }

    if(max==-1) return -1;

    return n-max;
    }
}