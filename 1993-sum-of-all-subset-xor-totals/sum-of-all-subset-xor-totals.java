class Solution {
    public int subsetXORSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        for(int n:nums){
            int size=list.size();
            for(int i=0;i<size;i++){
                List<Integer> res=new ArrayList<>(list.get(i));
                res.add(n);
                list.add(res);
            }
        }
        int sum=0;
        for(List<Integer> li:list){
            if(li.isEmpty()) continue;
            else if(li.size()==1) sum+=li.get(0);
            else{
                int add=li.get(0);
                for(int i=1;i<li.size();i++){
                    add^=li.get(i);
                }
                sum+=add;
            }
        }
        return sum;
    }
}