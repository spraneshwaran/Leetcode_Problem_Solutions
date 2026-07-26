class Solution {
    public String makeGood(String s) {
        Stack<Character> str=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(str.empty()){
                str.push(s.charAt(i));
                continue;
            }
            if(Character.isUpperCase(s.charAt(i)) && Character.toLowerCase(s.charAt(i))==str.peek()){
                str.pop();
                continue;
            }
            else if(Character.isLowerCase(s.charAt(i)) && Character.toUpperCase(s.charAt(i))==str.peek()){
                str.pop();
                continue;
            }
            str.push(s.charAt(i));
        }
        for(char c:str){
            sb.append(c);
        }
        return sb.toString();
    }
}