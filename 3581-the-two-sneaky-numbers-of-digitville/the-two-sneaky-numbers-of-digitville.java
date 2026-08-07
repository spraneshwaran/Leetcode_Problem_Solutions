class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int a[]=new int[2];
        int ind=0;
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            if(!set.add(i)){
                a[ind++]=i;
            }
        }
        return a;
    }
}