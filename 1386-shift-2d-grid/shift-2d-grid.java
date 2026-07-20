class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                li.add(grid[i][j]);
            }
        }
        k=k%li.size();
        int p=0;
        while(p<k){
            int temp=li.get(li.size()-1);
            li.add(0,temp);
            li.remove(li.size()-1);
            p++;
        }
        int count=0;
        for(int i=0;i<grid.length;i++){
            List<Integer> li1=new ArrayList<>();
            for(int j=0;j<grid[i].length;j++){
                li1.add(li.get(count));
                count++;
            }
            list.add(li1);
        }
        return list;
    }
}