class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i=0;
        int count=0;
        int j=piles.length-1;
        while(i<j){
            count+=piles[j-1];
            j--;
            j--;
            i++;
        }
        return count;
    }
}