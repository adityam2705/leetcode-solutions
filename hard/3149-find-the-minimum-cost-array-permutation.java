class Solution {
    int min = Integer.MAX_VALUE;
    int[] answer;

    public int[] findPermutation(int[] nums) {
            answer = new int[nums.length];

        boolean[] used = new boolean[nums.length];
        List<Integer> temp = new ArrayList<>();

        temp.add(0);
        used[0] = true;

        backtrack(nums, used, temp, 0);

        return answer;}


    void backtrack(int[] nums,boolean[] used,List<Integer> temp,int score) {
         if (score >= min) {
        return;}

        if (temp.size() == nums.length) {
        score += Math.abs(temp.get(temp.size() - 1)- nums[temp.get(0)]);

        if (score < min) {
            min = score;
            for (int i = 0; i < nums.length; i++) {
                answer[i] = temp.get(i);
            }
        }
        return;
    }

    for (int i = 0; i < nums.length; i++) {
        if (used[i]) continue;

        used[i] = true;
        temp.add(i);

        int newScore = score;

        if (temp.size() >= 2) {
            int prev = temp.get(temp.size() - 2);
            int curr = temp.get(temp.size() - 1);

            newScore += Math.abs(prev - nums[curr]);
        }

        backtrack(nums, used, temp, newScore);

        temp.remove(temp.size() - 1);
        used[i] = false;
    }
}

     }
                  