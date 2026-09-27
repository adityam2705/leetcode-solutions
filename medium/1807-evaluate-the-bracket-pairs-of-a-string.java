class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
    
    StringBuilder sb=new StringBuilder();
    HashMap<String,String> map = new HashMap<>();

    for(List<String> know:knowledge){
    map.put(know.get(0),know.get(1));}

    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      
      if(ch!='(' && ch!=')'){
        sb.append(ch);
        continue;}
      
      StringBuilder sb1=new StringBuilder();
        i++;

       while(i<s.length() && s.charAt(i)!=')'){
        
        sb1.append(s.charAt(i));
        i++;
        
        }
        
        sb.append(map.getOrDefault(sb1.toString(),"?"));
        
    }

   return sb.toString();
    }
}