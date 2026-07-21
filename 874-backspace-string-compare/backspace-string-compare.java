class Solution {
    public boolean backspaceCompare(String s, String t) {
        String str="";
        String str1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(str.isEmpty()) continue;
                str=str.substring(0,str.length()-1);
            }
            else str+=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(str1.isEmpty()) continue;
                str1=str1.substring(0,str1.length()-1);
            }
            else str1+=t.charAt(i);
        }
        return str.equals(str1);
    }
}