class Solution {
    public String greatestLetter(String s) {
        char c[]=s.toCharArray();
        Arrays.sort(c);
        String str="";
        for(int i=c.length-1;i>=0;i--){
            if(Character.isUpperCase(c[i])) break;
            for(int j=0;j<c.length;j++){
                if(Character.isLowerCase(c[j])) break;
                if(Character.toUpperCase(c[i])==c[j]){
                    return str+=c[j];
                }
            }
        }
        return str;
    }
}