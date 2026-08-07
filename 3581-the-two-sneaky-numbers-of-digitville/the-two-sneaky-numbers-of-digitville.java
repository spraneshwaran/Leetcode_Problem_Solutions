class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int a[]=new int[2];
        int ind=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j] && i!=j && ind<2){
                    a[ind++]=nums[i];
                }
            }
        }
        return a;
    }
}