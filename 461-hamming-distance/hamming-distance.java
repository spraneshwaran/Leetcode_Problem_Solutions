class Solution {
    public int hammingDistance(int x, int y) {
        x=x^y;
        return Integer.bitCount(x);
    }
}