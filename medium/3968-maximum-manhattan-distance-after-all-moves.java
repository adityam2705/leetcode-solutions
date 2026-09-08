class Solution {
     public int maxDistance(String moves) {
           int vcount=0;
           int hcount=0;
            int fcount=0;
          for(int i =0;i<moves.length();i++){
            char ch = moves.charAt(i);
            
            if(ch=='U') vcount++;
            if(ch=='D') vcount--;
            if(ch=='R') hcount++;
            if(ch=='L') hcount--;
            if(ch=='_') fcount++;}

           int result = Math.abs(vcount)+Math.abs(hcount)+fcount;
           return result;    }
}