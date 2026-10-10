class Solution {
    public int minOperations(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int steps = (26 - (s.charAt(i) - 'a')) % 26;
            ans = Math.max(ans, steps);
        }
        return ans;
    }
}
