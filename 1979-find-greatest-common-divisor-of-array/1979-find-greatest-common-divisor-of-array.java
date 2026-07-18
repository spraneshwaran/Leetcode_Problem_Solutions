class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>max) max=i;
            if(i<min) min=i;
        }
        int d=max;
        while(d!=1){
            if(min%d==0 && max%d==0) return d;
            d--;
        }
        return d;
    }
}