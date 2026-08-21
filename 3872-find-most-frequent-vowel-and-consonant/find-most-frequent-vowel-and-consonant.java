class Solution {
    public int maxFreqSum(String s) {
        int sum=0;
        String str="aeiou";
        int freq[]=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int max=0;
        for(char c:s.toCharArray()){
            if(str.indexOf(c)!=-1){
                max=Math.max(max,freq[c-'a']);
            }
            else{
                sum=Math.max(sum,freq[c-'a']);
            }
        }
        return sum+max;
    }
}