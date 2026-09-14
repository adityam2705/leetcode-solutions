
        class Solution {
    public char processStr(String s, long k) {

        long len = 0;

        // Forward pass: compute final length
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#') {
                len *= 2;
            } else if (ch == '*') {
                if (len > 0) len--;
            } else if (ch == '%') {
            } else {
                len++;
            }
        }

        if (k >= len) {
            return '.';
        }

        // Backward pass
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            if (ch == '#') {

                long oldLen = len / 2;

                if (k >= oldLen) {
                    k -= oldLen;
                }

                len = oldLen;

            } else if (ch == '*') {

                len++;

            } else if (ch == '%') {

                k = len - 1 - k;

            } else {

                len--;

                if (k == len) {
                    return ch;
                }
            }
        }

        return '.';
    }
}
