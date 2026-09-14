class Solution {
    public int maximum69Number (int num) {
      int temp = num;
     int digits = 0;

            while (temp > 0) {
              digits++;
              temp /= 10;}

            int[] arr = new int[digits];

        for (int i = digits - 1; i >= 0; i--) {
               arr[i] = num % 10;
               num /= 10;}
               int nums=0;
              int count=0;
        for(int i=0;i<arr.length;i++){
               if(arr[i]<9 && count==0){
                  arr[i]=9;
                  count++; }
               nums=nums*10+arr[i];
         }
         return nums;
    }
}