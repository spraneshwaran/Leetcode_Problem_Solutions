class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            StringBuilder sb=new StringBuilder(words[i]);
            for(int j=0;j<sb.length();j++){
                sum+=weights[sb.charAt(j)-'a'];
            }
            s.append((char)('z'-(sum%26)));
        }
        return s.toString();
    }
}