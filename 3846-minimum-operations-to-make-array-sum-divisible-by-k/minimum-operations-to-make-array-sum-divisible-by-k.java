class Solution {
    public int minOperations(int[] nums, int k) {
        int op=0;
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,nums[i]);
        }
        sum=sum%k;
        return sum;
    }
}