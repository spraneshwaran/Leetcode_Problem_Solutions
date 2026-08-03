class Solution {
    public int maxDistinct(String s) {
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int ct=0;
        for(int i:freq){
            if(i!=0) ct++;
        }
        return ct;
    }
}