class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==0)return 0;
        int odd=1;
        int oddsum=0;
        int evensum=0;
        int even=2;

        for(int i=0;i<n;i++){
            oddsum+=odd;
            odd+=2;
            evensum+=even;
            even+=2;}

            while(evensum%even !=0 || oddsum%even !=0){
                    even--;
            }
         
         return even;

        
    }
}