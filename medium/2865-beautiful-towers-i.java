import java.util.Arrays;
import java.util.Stack;

class Solution {
    public long maximumSumOfHeights(int[] heights) {
        int n = heights.length;
        long[] rightSum = new long[n];   // To store the sum of heights for the peak extending to the right
        long[] leftSum = new long[n];    // To store the sum of heights for the peak extending to the left
        long[] peakHeights = new long[n]; // To store the maximum possible height sum for each tower as the peak

        // Calculate indices of the next smaller element to the right for each tower
        int[] nsi = findNSI(heights);

        // Calculate indices of the previous smaller element to the left for each tower
        int[] psi = findPSI(heights);

        // Compute rightSum array
        for (int i = n - 1; i >= 0; i--) {
            // For each tower at index i, calculate the total height sum if it is considered as a peak extending to the right
            // `heights[i]` is the height of the current tower.
            // `(nsi[i] - i - 1)` calculates the number of towers that can extend right from the peak (until the next smaller element).
            // `rightSum[nsi[i]]` includes the previously computed sum for the next smaller element if it exists.
            rightSum[i] = heights[i] 
                + (long) heights[i] * (nsi[i] - i - 1) // Height extension to the right
                + (nsi[i] == n ? 0 : rightSum[nsi[i]]); // Add previously computed rightSum if there's a next smaller tower
        }

        // Compute leftSum array
        for (int i = 0; i < n; i++) {
            // For each tower at index i, calculate the total height sum if it is considered as a peak extending to the left
            // `heights[i]` is the height of the current tower.
            // `(i - psi[i] - 1)` calculates the number of towers that can extend left from the peak (until the previous smaller element).
            // `leftSum[psi[i]]` includes the previously computed sum for the previous smaller element if it exists.
            leftSum[i] = heights[i] 
                + (long) heights[i] * (i - psi[i] - 1) // Height extension to the left
                + (psi[i] == -1 ? 0 : leftSum[psi[i]]); // Add previously computed leftSum if there's a previous smaller tower
        }

        // Compute peakHeights array
        for (int i = 0; i < n; i++) {
            // For each tower, compute the maximum height sum if it is the peak.
            // `rightSum[i]` includes the height of the peak and its right extension.
            // `leftSum[i]` includes the height of the peak and its left extension.
            // Subtract `heights[i]` because it's included twice (once in rightSum and leftSum).
            peakHeights[i] = rightSum[i] + leftSum[i] - heights[i];
        }

        // Find and return the maximum value in peakHeights
        return Arrays.stream(peakHeights).max().orElseThrow();
    }

    /**
     * Finds the index of the next smaller element to the right for each element in the array.
     */
    public static int[] findNSI(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(result, n);

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            stack.push(i);
        }

        return result;
    }

    /**
     * Finds the index of the previous smaller element to the left for each element in the array.
     */
    public static int[] findPSI(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        Arrays.fill(result, -1);

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            stack.push(i);
        }

        return result;
    }
}