class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
       
     double result=0.0;  
     int num=0;
     int den=0;
       
       PriorityQueue<int[]> pq = new PriorityQueue<>(
    (a, b) -> Double.compare(
        (double)(b[0] + 1) / (b[1] + 1) - (double)b[0] / b[1],
        (double)(a[0] + 1) / (a[1] + 1) - (double)a[0] / a[1]
    )
);

   for(int[] c :classes){
    
    pq.offer(new int[]{c[0],c[1]});
       
   }

   for(int i=0;i<extraStudents;i++){
     int[] curr=pq.poll();
     
       curr[0]++;
       curr[1]++;
       
       pq.offer(curr);
       }
      
   
  
      for(int[] x:pq){  
         num=x[0];
         den=x[1];  
         
         result+=(double)num/den;
          }     
    
      
      return result/classes.length;
    }
}