class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int a[]=new int[matrix.length * matrix[0].length];
        for(int i=0,ind=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                a[ind++]=matrix[i][j];
            }
        }
        Arrays.sort(a);
        return a[k-1];
    }
}