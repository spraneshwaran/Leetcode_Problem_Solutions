class Solution {
    public int[] concatWithReverse(int[] nums) {
        int a[]=new int[2*nums.length];
        int i=0;
        int j=a.length-1;
        while(i<j){
            a[i]=nums[i];
            a[j]=nums[i];
            i++;j--;
        }
        return a;
    }
}