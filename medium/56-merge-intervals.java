class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];
         merged.add(prev);
        for (int []interval:intervals) {
            // Overlap condition: current start <= previous end
            if (interval[0] <= prev[1]) {
                // Merge intervals
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                // No overlap, add previous interval to result
                prev=interval;
                merged.add(prev);
               
            }
        }

        
        return merged.toArray(new int[merged.size()][]);
    }
}