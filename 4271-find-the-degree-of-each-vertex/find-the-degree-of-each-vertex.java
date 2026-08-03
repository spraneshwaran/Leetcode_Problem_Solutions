class Solution {
    public int[] findDegrees(int[][] matrix) {
        int degree[]=new int[matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 1 && i!=j){
                    degree[i]++;
                }
            }
        }
        return degree;
    }
}