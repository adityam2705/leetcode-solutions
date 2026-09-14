class Solution {

    List<String> fresult = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        give("", 0, 0, n);

        return fresult;
    }

    void give(String result, int open, int close, int n) {

        if(result.length() == 2 * n) {
            fresult.add(result);
            return;
        }

        if(open < n) {
            give(result + "(", open + 1, close, n);
        }

        if(close < open) {
            give(result + ")", open, close + 1, n);
        }
    }
}