class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {

        int count=0;
        int[] diff = new int[reward1.length];
        
        for(int i=0;i<reward1.length;i++){
          diff[i]=reward1[i]-reward2[i];
          count+=reward2[i];     }
     
         Arrays.sort(diff);
           
          for(int j=diff.length-1;j>=diff.length-k;j--){
                count+=diff[j];
             System.out.println(diff[j]);}

   return count; }
}