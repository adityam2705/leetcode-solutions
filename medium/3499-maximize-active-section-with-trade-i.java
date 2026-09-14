class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
          s = "1" + s + "1";

        int totalOnes = 0;
        for(char c : s.toCharArray()){
            if(c=='1')totalOnes++;}
            
                 totalOnes -= 2;

        List<Integer> len = new ArrayList<>();
        List<Character> type = new ArrayList<>();

        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            int j = i;
            while(j<s.length() && s.charAt(j)==ch) {
                j++;
            }
            type.add(ch);
            len.add(j - i);
            i = j;        }

        int ans = totalOnes;

        for (int k = 1; k < type.size() - 1; k++) {
            if (type.get(k) == '1'
                    && type.get(k - 1) == '0'
                    && type.get(k + 1) == '0') {

                ans = Math.max(ans,
                        totalOnes + len.get(k - 1) + len.get(k + 1));
            }
        }

        return ans;

 
 

       


    }
}