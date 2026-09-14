class Solution {
    public int minLights(int[] lights) {
        int n=lights.length;
      int[] diff = new int[n + 1];
  
  for(int i=0;i<n;i++){
      if(lights[i]==0)continue;
      
int left=Math.max(0,i-lights[i]);
int right=Math.min(i+lights[i],n-1);
  
       diff[left]++;
       if(right+1<n){
           diff[right+1]--;}
 
             }
      int ans=0;
      int curr=0;
                   
     for(int i=0;i<n;i++){
         curr+=diff[i];
        if(curr>0)continue;
         
         ans++;
         
     int pos=Math.min(i+1,n-1);
     
     int left=Math.max(pos-1,0);
     int right=Math.min(n-1,pos+1);
     
     diff[left]++;
     if(right+1<n){
         diff[right+1]--;}
         
         if(left==i){curr++;}
  
       
            }
       
              
      return ans;
    }
}