class Solution {
    public double angleClock(int hour, int minutes) {
        double mangle;
        double hangle;
        double ans;
        mangle=minutes*6; 
        hangle=hour*30+minutes*0.5;  
        ans= Math.abs(hangle-mangle);
        ans=Math.min(ans,360-ans);
        return ans;

    }
}