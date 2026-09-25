class Solution {
    public int hIndex(int[] citations) {
      
    int ans=0;
    int left=0;
    int right=citations.length-1;
    int mid=0;

    if(citations.length==0)return 0;

     while(left<=right){

        mid = left+(right-left)/2;  

        if(citations[mid]>=citations.length-mid){
           ans=citations.length - mid;
           right=mid-1;}

        else{
            left=mid+1;}
    
     }

    return ans;
    }
}