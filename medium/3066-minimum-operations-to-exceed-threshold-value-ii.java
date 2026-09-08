class Solution {
    public int minOperations(int[] nums, int k) {

     int count=0;    
     
     PriorityQueue<Long> pq = new PriorityQueue<>();

     for(int i=0;i<nums.length;i++){
        pq.add((long)nums[i]); }

    while( pq.size()>=2 && pq.peek()<k){
        
       long min=pq.poll();
       long max=pq.poll();
       long put= min*2+max;

      pq.offer(put);
    
       count++;
       }

return count;
    }
}