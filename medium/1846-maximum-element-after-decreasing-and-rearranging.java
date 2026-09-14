class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr){
        int max=1;
        Arrays.sort(arr);
        arr[0]=1;
        for(int i=1;i<arr.length;i++){
            if((arr[i]-arr[i-1])>1){
                arr[i]=1+arr[i-1];}
            max=Math.max(max,arr[i]);
        }
   return max;  }
}