class Solution {
    public int minimumPushes(String word) {

        int[] freq = new int[26];

     int len=word.length();
     int count=0;
     int unique=0;

   for(int i=0;i<len;i++){ 
    char ch = word.charAt(i);
    freq[ch - 'a']++;}

  Arrays.sort(freq);

    for(int i=25;i>=0;i--){
         if(freq[i]==0)continue;

        int push=unique/8 +1;
        count+=push*freq[i];
        unique++;
    }

   return count;   
    }
}