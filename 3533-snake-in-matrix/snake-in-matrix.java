class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int a[][]=new int[n][n];
        for(int i=0,v=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=v++;
            }
        }
        int i=0;
        int j=0;
        for(String s:commands){
            if(s.equals("RIGHT")) j++;
            else if(s.equals("LEFT")) j--;
            else if(s.equals("UP")) i--;
            else i++;
        }
        return a[i][j];
    }
}