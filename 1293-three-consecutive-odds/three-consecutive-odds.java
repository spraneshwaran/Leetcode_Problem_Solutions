class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int ct=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i] & 1 )== 1) ct++;
            else ct=0;
            if(ct==3) return true;
        }
        return false;
    }
}