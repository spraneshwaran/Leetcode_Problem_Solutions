class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int n=nums[i];
            while(n!=0){
                sum+=n%10;
                n/=10;
            }
            min=Math.min(min,sum);
        }
        return min;
    }
}