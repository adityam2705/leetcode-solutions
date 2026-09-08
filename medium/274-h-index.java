class Solution {
    public int hIndex(int[] citations) {
     //no of p){
        int h =0;
        Arrays.sort(citations);
        for(int i =0;i<citations.length;i++){
            int j= citations.length-i;//j =no of books
            if(j<=citations[i]){
                 h=j;
                 break;
            }}
        return h;}}

        
        
    
