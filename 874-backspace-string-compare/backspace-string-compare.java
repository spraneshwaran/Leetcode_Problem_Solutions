class Solution {
    public boolean backspaceCompare(String s, String t) {
        String str="";
        String str1="";
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='#'){
                if(s1.size()!=0) s1.pop();
            }
            else s1.push(c);
        }
        for(char c:t.toCharArray()){
            if(c=='#'){
                if(s2.size()!=0) s2.pop();
            }
            else s2.push(c);
        }
        return s1.equals(s2);
    }
}