class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int r=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=r){
                list.add(r);
                i--;
            }
            r++;
        }
        return list;
    }
}