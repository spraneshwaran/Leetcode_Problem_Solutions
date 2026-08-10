class Solution {
    public String convertDateToBinary(String date) {
        String str[]=date.split("-");
        String s1="";
        for(String s:str){
            int n=Integer.valueOf(s);
            s1+=Integer.toBinaryString(n);
            s1+='-';
        }
        return s1.substring(0,s1.length()-1);
    }
}