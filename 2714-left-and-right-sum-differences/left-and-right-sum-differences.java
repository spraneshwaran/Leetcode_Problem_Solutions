class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            left[i]=sum;
            sum+=nums[i];
        }
        sum=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            right[i]=sum;
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs((left[i]-right[i]));
        }
        return nums;
    }
}