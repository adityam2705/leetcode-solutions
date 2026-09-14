class Pair{
   String s;
   int n;

   Pair(String s, int n){
      this.s=s;
      this.n=n;}
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
      Set<String> set = new HashSet<>();

    for(int i=0;i<wordList.size();i++){set.add(wordList.get(i));}
      Queue<Pair> q= new LinkedList<>();
      q.offer(new Pair(beginWord,1));

      while(!q.isEmpty()){
            Pair curr= q.poll();
              String sb= curr.s;
              int level = curr.n;
               
        if(endWord.equals(curr.s))return level;

          for(int i=0;i<sb.length();i++){
              StringBuilder sbb =new StringBuilder(sb);
              for(char ch='a';ch<='z';ch++){
                  if(ch == sb.charAt(i)) continue;
                  sbb.setCharAt(i,ch);
                  String cur=sbb.toString();

                if(set.contains(cur)){
                    set.remove(cur);
                    q.offer(new Pair(cur,level+1));}}}}

   

return 0;
    }
}