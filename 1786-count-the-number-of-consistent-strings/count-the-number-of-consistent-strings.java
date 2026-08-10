class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String s:words){
            int c=0;
            for(int i=0;i<s.length();i++){
                if(allowed.indexOf(s.charAt(i)) == -1){
                    c++;
                    break;
                }
            }
            if(c==0) count++;
        }
        return count;
    }
}