class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int i=0;
        int max=0;
    for(int j=0;j<s.length();j++){
         char re=s.charAt(j);
        if(re=='a'||re=='e'||re=='o'||re=='i'||re=='u'){count++;}
 
          if(j-i+1==k){
            max=Math.max(max,count);
              char ch=s.charAt(i);
              if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'){count--;}
                      i++; }
}

   return max; }
}