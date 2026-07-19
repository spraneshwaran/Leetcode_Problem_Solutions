class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.contains(s)) return true;
        int p=0;
        for(int i=0;i<s.length();i++) {
            t = t.substring(p);
            int ind=t.indexOf(s.charAt(i));
            if(ind==-1) return false;
            else p=ind+1;
        }
        return true;
    }
}