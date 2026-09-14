class Solution {
      private boolean ispossible(int[] position,int dist,int k){
        int count=1; 
        int last=position[0];
        for(int i=0;i<position.length;i++){
            if(position[i]-last>=dist){
                count++;
                last=position[i];
            }
            if(count==k){
                 return true;
            }
        }
        return false;
      }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
       int n=position.length;
       int low=1;
       int high=position[n-1]-position[0];
       while(low<=high){
        int mid=(low+high)/2;
        if(ispossible(position,mid,m)){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       }
       return high;


        

    }
}