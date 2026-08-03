class Solution {
    public int mirrorDistance(int n) {
        int n1=n;
        int rev=0;
        while(n1!=0){
            int d=n1%10;
            rev=rev*10+d;
            n1/=10;
        }
        return Math.abs(n-rev);
    }
}