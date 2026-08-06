class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=0;
        int even=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0) odd+=i;
            else even+=i;
        }
        while(even!=0){
            int rem=odd%even;
            odd=even;
            even=rem;
        }
        return odd;
    }
}