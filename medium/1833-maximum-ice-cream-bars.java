class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] freq = new int[100001];
        for(int cost:costs){
            freq[cost]++;
        }
      int count=0;
        for(int i=1;i<100001;i++){
                int canbuy= Math.min(freq[i],coins/i);
                    coins-=canbuy*i;
                    count+=canbuy;
                if(coins<i) break;}

                 return count;

        }}
    
