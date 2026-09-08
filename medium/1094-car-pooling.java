class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int count=0;
        int range=Integer.MAX_VALUE;
        boolean[] removed = new boolean[trips.length];
        Arrays.sort(trips, (a, b) -> Integer.compare(a[1], b[1]));
        for(int i=0;i<trips.length;i++){

            for (int j = 0; j < i; j++) {      //checking
               if (!removed[j] && trips[j][2] <= trips[i][1]) {
                    count-= trips[j][0];
                    removed[j] = true;} }

            count+=trips[i][0];
            if(count>capacity)return false;   }

         return true;
    }
}