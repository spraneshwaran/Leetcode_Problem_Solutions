class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1=new Stack<>();
        for(char c:s.toCharArray()){
            if(!s1.empty() && c==s1.peek()){
                s1.pop();
            }
            else s1.push(c);
        }
        String str="";
        for(char c:s1){
            str+=c;
        }
        return str;
    }
}