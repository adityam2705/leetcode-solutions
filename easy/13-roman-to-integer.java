class Solution {
    public int romanToInt(String s) {
       Map<Character, Integer> romanValues = new HashMap<>();
    romanValues.put('I', 1);
    romanValues.put('V', 5);
    romanValues.put('X', 10);
    romanValues.put('L', 50);
    romanValues.put('C', 100);
    romanValues.put('D', 500);
    romanValues.put('M', 1000);
        int n=s.length();
        int sum=0;
        for(int i=0;i<n-1;i++){ 
            int current = romanValues.get(s.charAt(i));
        int next = romanValues.get(s.charAt(i + 1));

        if(current>=next){
            sum+=romanValues.get(s.charAt(i));;
        }
        else{
            sum-=current;
        }
            
        }
    sum=sum+romanValues.get(s.charAt(n-1)); 
    return sum;
    }
}