class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int sum=0;
        int pro=1;
        while(n!=0){
            sum+=(n%10);
            pro*=(n%10);
            n/=10;
        }
        return (num%(sum+pro)==0)?true:false;
    }
}