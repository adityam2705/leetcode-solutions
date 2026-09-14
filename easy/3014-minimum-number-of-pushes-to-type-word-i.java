class Solution {
    public int minimumPushes(String word) {
        
     int len=word.length();
     int count=0;
    
    while(len>24){
        count+=4;
        len--;
    }

    while(len>16){
         count+=3;
         len--;}

    while(len>8){
        count+=2;
        len--;}
   
   while(len>0){
      count++;
      len--;
   }

   return count;

    }
}