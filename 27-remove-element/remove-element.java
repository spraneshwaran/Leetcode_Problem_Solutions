class Solution {
    public int removeElement(int[] a, int val) {
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==val) a[i]=-1;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==-1) continue;
            a[j++]=a[i];
        }
        return j;
    }
}