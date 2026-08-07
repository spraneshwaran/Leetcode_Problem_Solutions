class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list=new ArrayList<>();
        s1=s1+" "+s2;
        for(String s:s1.split(" ")){
            list.add(s);
        }
        list.removeIf(s -> Collections.frequency(list, s) > 1);
        String str[]=new String[list.size()];
        int ind=0;
        for(String s:list){
            str[ind++]=s;
        }
        return str;
    }
}