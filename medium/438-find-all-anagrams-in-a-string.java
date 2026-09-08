class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int[] store = new int[26];
        int[] check = new int[26];
        int left=0;
      
       for(int i=0;i<p.length();i++){
          char ch=p.charAt(i);
          store[ch-'a']++;}


       for(int right=0;right<s.length();right++ ){
           char r=s.charAt(right);
              check[r-'a']++;

            while(right-left+1>p.length()){
             char l=s.charAt(left);
              check[l-'a']--;
              left++;
            }

            if(right-left+1==p.length()){
                if(Arrays.equals(store,check))result.add(left);}
       }

       return result;
    }
}