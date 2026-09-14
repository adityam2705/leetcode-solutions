class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> lines= new ArrayList<>();
        int index=0;
        while(index<words.length){
            int sum=words[index].length();
            int last=index+1;
            while(last<words.length){
                if( sum+1+words[last].length() > maxWidth) break;
                sum+=words[last].length()+1;
                last++;}
            
            StringBuilder sb =new StringBuilder();
            sb.append(words[index]);
            int diff=last-index-1;
            // last line edge case// jaha sab ab gap hi aane hai
            if(last==words.length || diff==0){
                for(int i=index+1;i<last;i++){
              sb.append(" ");
              sb.append(words[i]);
            }
            for(int i= sb.length();i<maxWidth;i++){
                sb.append(" ");
            }}
            else{//Calculate spaces
              int spaces=(maxWidth-sum)/diff ;
              int extraspaces=(maxWidth-sum)%diff;
              for(int i=index+1;i<last;i++){
                for(int s=spaces;s>0;s--){
                   sb.append(" ");}
                   if(extraspaces>0){
                    sb.append(" ");
                    extraspaces--;
                   }
                   sb.append(" ");
                   sb.append(words[i]);
              }
              }
          lines.add(sb.toString());
          index=last;
        

        }
        return lines;
    }
}