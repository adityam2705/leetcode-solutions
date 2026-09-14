class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int suml=0;
        int sumr=0;
        int max=0;
        int n=cardPoints.length;
        int rindex =0;
        for(int i=0;i<k;i++){
           suml+=cardPoints[i];}
           max=suml;
           rindex=n-1;
           for(int i=k-1;i>=0;i--){
            suml-=cardPoints[i];
           sumr+=cardPoints[rindex];
           rindex--;
           max=Math.max(max,sumr+suml);
           
        }
return max;
    }
}