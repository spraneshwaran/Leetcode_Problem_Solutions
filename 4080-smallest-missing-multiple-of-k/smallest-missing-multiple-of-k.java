class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int n=k;
        for(int i=0;i<nums.length;i++){
            if(k==nums[i]) k=k+n;
        }
        return k;
    }
}