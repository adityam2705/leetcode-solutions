class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        
        StringBuilder result=new StringBuilder();

        for(int i=0;i<words.length;i++){
          
           int count=0;

          for(int j=0;j<words[i].length();j++){
            
            char ch=words[i].charAt(j);

            count+=weights[ch-'a'];}       
              
           
           result.append((char)('z'-(count%26)));}


    return result.toString();
    }
}