class Solution {
    public int reverse(int x) {
        StringBuilder sb=new StringBuilder(String.valueOf(x));
        sb.reverse();
        long l=0;
        if(sb.charAt(sb.length()-1)=='-'){
            sb.deleteCharAt(sb.length()-1);
            l = Long.valueOf(('-'+sb.toString()));
        }
        else l= Long.valueOf(sb.toString());
        if(l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) return 0;
        return (int)l;
    }
}