class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int a[]=new int[friends.length];
        for(int i=0,k=0;i<order.length;i++){
            for(int j=0;j<friends.length;j++){
                if(k==friends.length) break;
                if(order[i]==friends[j]) a[k++]=friends[j];
            }
        }
        return a;
    }
}