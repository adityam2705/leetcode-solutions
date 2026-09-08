
        class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];    }
            for (int j = 0; j < m+n - 1;j++) {
          
            // Assume the current position holds
            // the minimum element
            int min_idx = j;

            // Iterate through the unsorted portion
            // to find the actual minimum
            for (int k = j + 1; k < m+n; k++) {
                if (nums1[k] < nums1[min_idx]) {
                  
                    // Update min_idx if a smaller element
                    // is found
                    min_idx = k;
                }
            }

            // Move minimum element to its
            // correct position
            int temp = nums1[j];
            nums1[j] = nums1[min_idx];
            nums1[min_idx] = temp;           
        }
    }}
        
    
    
