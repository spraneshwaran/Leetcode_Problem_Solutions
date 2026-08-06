class Solution {
    public int matrixSum(int[][] nums) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<nums[0].length;j++){
                temp.add(nums[i][j]);
            }
            list.add(temp);
        }
        int score=0;
        for(int i=0;i<nums[0].length;i++){
            int max=0;
            for(List<Integer> temp:list){
                max=Math.max(max,Collections.max(temp));
                temp.remove(Collections.max(temp));
            }
            score+=max;
        }
        return score;
    }
}