class Solution {
    public int maximumProduct(int[] nums, int k) {
        long mod = 1000000007L;

   // just increase smallest one at the moment
        PriorityQueue<Integer> pq= new PriorityQueue<>();
         long ans=1;

    for(int i=0;i<nums.length;i++){
        pq.offer(nums[i]);}

     for(int i=0;i<k;i++){
          int min=pq.poll();
             min++;
             pq.offer(min);}

        for(int x:pq){
           ans=(ans*x)%mod;}


return (int) ans;
    }
}