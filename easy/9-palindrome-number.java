class Solution {
    public boolean isPalindrome(int x) {
        if(x<0|| (x % 10 == 0 && x != 0)){
            return false;
        }
        int rev = 0;
        
        while (x>rev) {
    rev = rev * 10 + x % 10; // Add last digit
    x = x / 10;            // Remove last digit
} 
 return x == rev || x == rev / 10;
    }
}