class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

       int count=0;

      HashSet<List<Integer>> set= new HashSet<>();  
      HashSet<Integer> setr= new HashSet<>(); 

     for(int[] pair:reservedSeats ){
        set.add(Arrays.asList(pair[0],pair[1])); 
        setr.add(pair[0]);}

 
 for(int rown: setr){
     for(int j=2;j<=6;j+=2){
          if(!set.contains(Arrays.asList(rown,j)) && !set.contains(Arrays.asList(rown,j+1)) && !set.contains     (Arrays.asList(rown,j+2)) && !set.contains(Arrays.asList(rown,j+3)) ){  
              count++;
             
             set.add(Arrays.asList(rown,j+2));
             set.add(Arrays.asList(rown,j+3)); } } } 

       
       count+=(n-setr.size())*2;

    return count;
    }
}