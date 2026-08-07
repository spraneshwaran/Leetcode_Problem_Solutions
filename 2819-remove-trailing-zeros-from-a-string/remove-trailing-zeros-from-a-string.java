class Solution {
    public String removeTrailingZeros(String num) {
        List<Character> list=new ArrayList<>();
        for(char c:num.toCharArray()){
            list.add(c);
        }
        while(list.get(list.size()-1)=='0'){
            list.removeLast();
        }
        StringBuilder sb=new StringBuilder();
        for(char c:list){
            sb.append(c);
        }
        return sb.toString();
    }
}