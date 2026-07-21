class Solution {
    public boolean backspaceCompare(String s, String t) {
        String str="";
        String str1="";
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(s1.size()!=0) s1.pop();
            }
            else s1.push(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(s2.size()!=0) s2.pop();
            }
            else s2.push(t.charAt(i));
        }
        return s1.equals(s2);
    }
}