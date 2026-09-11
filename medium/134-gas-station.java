class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sst =0;
        int tt=0;
        int ct=0;
        for(int i=0;i<cost.length;i++){
            int gain =gas[i]-cost[i];
            tt =gain+tt;
            ct= gain+ct;
            if(ct<0){
                sst=i+1;
                ct=0;
            }}
           return tt>=0?sst:-1;
        
        
    }
}