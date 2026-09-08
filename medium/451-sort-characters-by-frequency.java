class Solution {
    public String frequencySort(String s) {
      
      HashMap<Character,Integer> map = new HashMap<>();

      for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);}

    List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());

   list.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));
  
     StringBuilder sb= new StringBuilder();

    for(Map.Entry<Character,Integer> entry : list){
        
       int freq= entry.getValue();
        char ch=entry.getKey();
 
        while(freq>0){
         sb.append(ch);
         freq--;      }

    }

   return sb.toString();
    }
}