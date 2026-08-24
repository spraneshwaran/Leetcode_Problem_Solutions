class Solution {
    public int xorOperation(int n, int start) {
        int op=start+2*0;
        for(int i=1;i<n;i++){
            op^=start+2*i;
        }
        return op;
    }
}