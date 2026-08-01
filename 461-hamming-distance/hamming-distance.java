class Solution {
    public int hammingDistance(int x, int y) {
        x=x^y;
        String s=Integer.toBinaryString(x);
        int ct=0;
        for(int i=0;i<s.length();i++){
            if(Integer.valueOf(s.charAt(i)-'0') == 1) ct++;
        }
        return ct;
    }
}