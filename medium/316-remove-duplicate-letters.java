class Solution {
    public String removeDuplicateLetters(String s) {
           int n=s.length();
     boolean[] visited= new boolean[26];
     int[] loc = new int[26];
        Deque<Character> st = new ArrayDeque<>();

        for(int i=0;i<n;i++){
            char ne=s.charAt(i);
            loc[ne-'a']=i;}

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!visited[ch-'a']){
                while(!st.isEmpty() && st.peek()>ch && loc[st.peek()-'a']>i){
                    visited[st.peek()-'a']=false;
                    st.pop();}
                    st.push(ch);
                    visited[ch-'a']=true;}}
           
          StringBuilder sb=new StringBuilder();

           while(!st.isEmpty()){sb.append(st.removeLast());}

         String str=sb.toString();

        return str; 
    }
}