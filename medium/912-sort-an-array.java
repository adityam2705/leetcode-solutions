class Solution {
    public int[] sortArray(int[] nums) {  
        breaks( nums,0,nums.length-1);
      return nums; }
    void breaks(int[]arr ,int low, int high){
        if(low==high) return;
        int mid = low + (high -low )/2;
             breaks(arr,low,mid);
             breaks(arr,mid+1,high);
             merge(arr,low,mid,high); }
    void merge(int[]arr,int low,int mid,int high){
            int n1 = mid-low+1;
            int n2 = high - mid;
        int [] l = new int[n1];
        int [] r = new int[n2];
        int k = low;
        for(int i=0; i<n1; i++){
            l[i]= arr[k];
            k++;}
        for(int i=0; i<n2; i++){
            r[i]= arr[k];
            k++;}
        int i=0;
        int j=0;
         k=low;
         while( i<n1 && j<n2){
          if( l[i]<=r[j]){
            arr[k] = l[i];
            i++; }
          else{
             arr[k]= r[j];
               j++; }
              k++;
           }
         
         while(i<n1){
             arr[k]= l[i];
             i++;
             k++;
         }
         while(j<n2){
            arr[k]=r[j];
            j++;
            k++;
         }
                    }
    

        }
        
