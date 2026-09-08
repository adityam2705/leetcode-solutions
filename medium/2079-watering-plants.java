class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count=0;
        int storage=capacity;
     for(int i=0;i<plants.length;i++){

         if(storage<plants[i]){
            count+=i*2;
            storage=capacity;} 
            
          count++;
          storage-=plants[i];
                  }
   return count;  }
}