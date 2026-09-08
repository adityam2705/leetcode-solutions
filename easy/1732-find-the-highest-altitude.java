class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;

        int [] prefix = new int[gain.length];
        prefix[0]=gain[0];
        for(int i=0;i<gain.length-1;i++){
            prefix[i+1]=prefix[i]+gain[i+1];
            max=Math.max(max,prefix[i+1]);
        }
        return Math.max(max,gain[0]);
    }
}