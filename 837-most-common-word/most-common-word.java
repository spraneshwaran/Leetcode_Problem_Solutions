class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-Z]", " ");
        paragraph=paragraph.toLowerCase();
        String str[]=paragraph.split("\\s+");
        int max=0;
        String s="";
        for(int i=0;i<str.length;i++){
            boolean isban = false;
            for(int j=0;j<banned.length;j++){
                if(str[i].equals(banned[j])){
                    isban=true;
                    break;
                }
            }
            if(isban) continue;
            int count=0;
            for(int j=0;j<str.length;j++){
                if(str[i].equals(str[j])) count++;
            }
            if(count > max){
                s=str[i];
                max=count;
            }
        }
        return s;
    }
}