class Solution {
    public int smallestNumber(int n, int t) {
        int pro=1;
        do{
            pro=1;
            int num=n;
            while(num!=0){
                pro*=(num%10);
                num/=10;
            }
            n++;
        }while(pro%t !=0 );
        return n-1;
    }
}