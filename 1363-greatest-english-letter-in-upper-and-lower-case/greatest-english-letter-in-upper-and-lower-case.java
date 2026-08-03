class Solution {
    public String greatestLetter(String s) {
        for(char c='Z';c>='A';c--){
            if(s.indexOf(c) != -1 && s.indexOf(Character.toLowerCase(c)) != -1) return String.valueOf(c);
        }
        return "";
    }
}