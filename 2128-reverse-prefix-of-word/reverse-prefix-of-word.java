class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        for(int i=0,j=0;i<word.length();i++){
            sb.append(word.charAt(i));
            if(word.charAt(i)==ch && j<1){
                sb.reverse();
                j++;
            }
        }
        return sb.toString();
    }
}