class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String s="";
        for(int i=0;i<words.length;i++){
            int sum=0;
            StringBuilder sb=new StringBuilder(words[i]);
            for(int j=0;j<sb.length();j++){
                sum+=weights[sb.charAt(j)-'a'];
            }
            sum=sum%26;
            s+=(char)(122-sum);
        }
        return s;
    }
}