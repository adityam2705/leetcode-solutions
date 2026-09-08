class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        double totalh=0;
        int high=0;
        int low=1;
        int mid=0;
         
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        int ans=high;
        while(low<=high){
            mid =(low+high)/2;
             totalh =totalbanana(piles,mid);
        if(h>=totalh){
        ans=mid;
        high=mid-1;
            }
        else {
            low=mid+1;
        }
        }
        return ans;
        
    }
    public double totalbanana(int[]piles,int mid){
        double totalb =0;
        for(int i=0;i<piles.length;i++){
        totalb+=Math.ceil((double)piles[i]/mid);
        }
        return totalb;

    }
}