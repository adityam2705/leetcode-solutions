class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int x=0;
       int y=0;
        int sum=0;
        int r=numbers.length-1;
        int l=0;
          while(r>l){ 
            sum=numbers[l]+numbers[r];
            if(sum==target){
                x=l+1;
                y=r+1;
                break;
            }
            else if(sum>target){
            r--;}
        else{
         l++;
         }
          }
 int[] output={x,y};
return output;}
}