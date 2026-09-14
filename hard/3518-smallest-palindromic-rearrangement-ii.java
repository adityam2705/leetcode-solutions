class Solution {
    public String smallestPalindrome(String s, int k) {

        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }

        int[] halfFreq = new int[26];
        StringBuilder middle = new StringBuilder();

        int halfLength = 0;

        for(int i=0;i<26;i++){

            if(freq[i]%2==1){
                middle.append((char)(i+'a'));
            }

            halfFreq[i]=freq[i]/2;
            halfLength+=halfFreq[i];
        }

        if(countWays(halfFreq,k)<k){
            return "";
        }

        StringBuilder leftHalf = new StringBuilder();

        for(int pos=0;pos<halfLength;pos++){

            for(int ch=0;ch<26;ch++){

                if(halfFreq[ch]==0){
                    continue;
                }

                halfFreq[ch]--;

                long ways=countWays(halfFreq,k);

                if(ways>=k){

                    leftHalf.append((char)(ch+'a'));
                    break;
                }

                k-=ways;
                halfFreq[ch]++;
            }
        }

        StringBuilder ans=new StringBuilder(leftHalf);

        ans.append(middle);
        ans.append(new StringBuilder(leftHalf).reverse());

        return ans.toString();
    }

    private long countWays(int[] halfFreq,long limit){

        long ways=1;
        int totalLetters=0;

        for(int count:halfFreq){

            if(count==0){
                continue;
            }

            totalLetters+=count;

            long n=totalLetters;
            long r=count;

            r=Math.min(r,n-r);

            long combination=1;

            for(int i=1;i<=r;i++){

                combination=combination*(n-i+1)/i;

                if(combination>limit){
                    combination=limit+1;
                    break;
                }
            }

            ways*=combination;

            if(ways>limit){
                return limit+1;
            }
        }

        return ways;
    }
}