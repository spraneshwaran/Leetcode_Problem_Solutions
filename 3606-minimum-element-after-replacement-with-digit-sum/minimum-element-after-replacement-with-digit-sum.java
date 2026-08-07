class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int n=nums[i];
            while(n!=0){
                sum+=n%10;
                n/=10;
            }
            nums[i]=sum;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}