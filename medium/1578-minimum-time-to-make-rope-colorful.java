class Solution {
    public int minCost(String colors, int[] neededTime) {
        int count=0;
        int prevalue=neededTime[0];
        
     for(int i=1;i<neededTime.length;i++){
           if(colors.charAt(i) != colors.charAt(i - 1)){prevalue=0;}
               count+=Math.min(prevalue,neededTime[i]); 
                prevalue=Math.max(prevalue,neededTime[i]);  
            }
             

            return count;
          
    }
}