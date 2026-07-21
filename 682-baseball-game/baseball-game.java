class Solution {
    public int calPoints(String[] operations) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            char c=operations[i].charAt(0);
            if(c=='+'){
                int a=li.get(li.size()-1)+li.get(li.size()-2);
                li.add(a);
            }
            else if(c=='D'){
                li.add(li.get(li.size()-1) * 2);
            }
            else if(c=='C'){
                li.remove(li.size()-1);
            }
            else{
                int a=Integer.valueOf(operations[i]);
                li.add(a);
            }
        }
        int sum=0;
        for(int i:li){
            sum+=i;
        }
        return sum;
    }
}