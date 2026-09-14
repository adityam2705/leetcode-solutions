class Solution {
    public int minimumRefill(int[] plants, int capA, int capB) {
   int count = 0;
int bucketA = capA;
int bucketB = capB;
int i = 0;
int j = plants.length - 1;

while (i <= j) {
    // Same plant - check who has more water
    if (i == j) {
        if (bucketA >= bucketB) {
            // Alice waters
            if (plants[i] > bucketA) {
                bucketA = capA;
                count++;
            }
            bucketA -= plants[i];
        } else {
            // Bob waters
            if (plants[i] > bucketB) {
                bucketB = capB;
                count++;
            }
            bucketB -= plants[i];
        }
        break;
    }
    
    // Alice waters plant at i
    if (plants[i] > bucketA) {
        bucketA = capA;
        count++;
    }
    bucketA -= plants[i];
    i++;
    
    // Bob waters plant at j
    if (plants[j] > bucketB) {
        bucketB = capB;
        count++;
    }
    bucketB -= plants[j];
    j--;
}

return count;  }
}