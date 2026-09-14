class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder merge= new StringBuilder();
        int i=0;
        int j=0;
        int n1=word1.length();
        int n2=word2.length();
        while(i<n1 || j<n2){
          char ch1 = (i < n1) ? word1.charAt(i) : '\0';
          char ch2 = (j < n2) ? word2.charAt(j) : '\0';
           if(ch1-'a'>ch2-'a'){
                merge.append(ch1);
                i++;}                                   
           else if(ch1-'a'<ch2-'a'){
                merge.append(ch2);
                j++;}
           else{
                if(isBetter(i, j, word1, word2)){merge.append(ch1);
                    i++;}
                else {merge.append(ch2);
                    j++;}    
                }           
        }
    return merge.toString();
    }

    boolean isBetter(int i, int j,String word1, String word2 ){
            
        int n1=word1.length();
        int n2=word2.length();
            while(i<n1 && j<n2 &&word1.charAt(i)==word2.charAt(j)){
                i++;
                j++;
            }

        if(i>=n1)return false;
        if(j>=n2)return true;

        if(word1.charAt(i)-'a'>word2.charAt(j)-'a' ){return true;}
        else{ return false; }


    }
}