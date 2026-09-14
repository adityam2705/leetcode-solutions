class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
         int[] poss=new int[]{12,23,34,45,56,67,78,89,123,234,345,456,567,678,789,1234,2345,3456,4567,5678,6789,12345,23456,34567,45678,56789,123456,234567,345678,456789,1234567,2345678,3456789,12345678,23456789,123456789};

         int start=0;
         List<Integer> ans= new ArrayList<>();
     if(low>123456789)return ans;
         for(int i=0;i<poss.length;i++){
            if(poss[i]>=low){
                start=i;
                break;}}

         for(int i=start;i<poss.length;i++){
            if(poss[i]>high)break;

             ans.add(poss[i]);
         }
  
  return ans;
    }
}