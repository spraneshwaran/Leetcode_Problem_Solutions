class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            StringBuilder sb=new StringBuilder(words[i]);
            for(int j=0;j<sb.length();j++){
                sum+=weights[sb.charAt(j)-'a'];
            }
            sum=sum%26;
            s.append((char)(122-sum));
        }
        return s.toString();
    }
}