class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        int n=s.length()-1;
        for(int i=n;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }

            if(s.charAt(i)==' ' && count>0){
                break;
            }
        }
        return count;
    }
}