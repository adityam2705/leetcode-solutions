class Solution {
    public int characterReplacement(String s, int k) {
      HashMap<Character,Integer> map = new HashMap<>();
        int i=0;
        int max=0;
        int maxfreq = 0;

       for(int j=0;j<s.length();j++){
              char ch=s.charAt(j);
              map.put(ch,map.getOrDefault(ch,0)+1);
              maxfreq=Math.max(maxfreq,map.get(ch));

            while((j-i+1) - maxfreq>k){
                 char re=s.charAt(i);
                map.put(re,map.get(re)-1);
                if(map.get(re)==0)map.remove(re);
                  i++; } 

                max=Math.max(max,j-i+1);}

     return max;
    }
}