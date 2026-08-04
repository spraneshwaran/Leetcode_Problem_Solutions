class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && nums1[i]!=-1){
                    list.add(nums1[i]);
                    nums1[i]=-1;
                    nums2[j]=-1;
                }
            }
        }
        int a[]=new int[list.size()];
        for(int i=0;i<a.length;i++){
            a[i]=list.get(i);
        }
        return a;
    }
}