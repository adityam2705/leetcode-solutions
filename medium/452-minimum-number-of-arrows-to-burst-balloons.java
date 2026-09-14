class Solution {
    public int findMinArrowShots(int[][] points) {
       if (points.length == 0) return 0;

        // Sort balloons by their right edge
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;           // First arrow to start the party
        int arrowPos = points[0][1]; // Shoot it at the end of the first balloon

        for (int i = 1; i < points.length; i++) {
            // Balloon is out of reach? Shoot another arrow 
            if (points[i][0] > arrowPos) {
                arrows++;
                arrowPos = points[i][1]; // Aim new arrow at this balloon's end
            }
            // Else: our arrow is already popping this balloon 
        }

        return arrows; // Total arrows used
}}