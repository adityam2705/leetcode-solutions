class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
 
       List<Integer> result = new ArrayList<>();
       if(tomatoSlices==0 && cheeseSlices==0 ){
        result.add(0);
        result.add(0);
        return result;}
    int small = (tomatoSlices-2*cheeseSlices);
         
    int big = (4*cheeseSlices-tomatoSlices);
     
     if(small % 2 == 0 && big % 2 == 0 && small>=0 && big>=0){
      result.add(small/2);
      result.add(big/2);}

      return result;
       

    


    }
}