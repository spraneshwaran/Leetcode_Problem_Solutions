class Solution {
    public int countSymmetricIntegers(int low, int high) {
        if(low<10) low=10;
        int count=0;
        for(int i=low;i<=high;i++){
            if(digit(i)%2!=0) continue;
            String s=String.valueOf(i);
            int pre=Integer.valueOf(s.substring(0,s.length()/2));
            int suf=Integer.parseInt(s.substring(s.length()/2));
            if(sum(pre)==sum(suf)) count++;
        }
        return count;
    }
    public int sum(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
    public int digit(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
}