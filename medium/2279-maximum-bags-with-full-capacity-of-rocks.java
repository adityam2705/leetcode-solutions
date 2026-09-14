class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count=0;
        int n=capacity.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=capacity[i]-rocks[i];}
            Arrays.sort(ans);
         for(int j=0;j<n;j++){
           if(ans[j]==0){count++;
            continue;}
           if(ans[j]<=additionalRocks){
              additionalRocks-=ans[j];
              count++;}
            else{break;}    } 

            return count;}
}