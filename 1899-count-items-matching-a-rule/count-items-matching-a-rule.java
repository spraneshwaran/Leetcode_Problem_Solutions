class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        String s[]={"type","color","name"};
        int ind=0;
        for(int i=0;i<s.length;i++){
            if(s[i].equals(ruleKey)) ind=i;
        }
        for(List<String> list : items){
            if(list.get(ind).equals(ruleValue)) count++;
        }
        return count;
    }
}