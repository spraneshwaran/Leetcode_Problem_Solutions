class Solution {
    public boolean detectCapitalUse(String word) {
        String a=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        if(word == word.toUpperCase() || word == word.toLowerCase() || word.equals(a)) return true;
        return false;
    }
}