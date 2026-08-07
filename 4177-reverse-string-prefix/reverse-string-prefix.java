class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb=new StringBuilder(s.substring(0,k));
        s=sb.reverse().toString()+s.substring(k);
        return s;
    }
}