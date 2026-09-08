class Solution {
    public String removeStars(String s) {
        int count=0;
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='*'){count++;
               continue;}
            if(count>0){count--;
                 continue;}
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}