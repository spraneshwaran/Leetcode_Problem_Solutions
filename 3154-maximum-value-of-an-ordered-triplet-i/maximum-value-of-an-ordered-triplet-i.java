class Solution {
    public long maximumTripletValue(int[] nums) {
        long max_sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    long t=(long)(nums[i]-nums[j])*nums[k];
                    max_sum=Math.max(max_sum,t);
                }
            }
        }
        return max_sum;
    }
}
