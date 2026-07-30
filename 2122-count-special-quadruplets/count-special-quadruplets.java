class Solution {
    public int countQuadruplets(int[] a) {
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    for(int l=k+1;l<a.length;l++){
                        if(a[i]+a[j]+a[k]==a[l]) count++;
                    }
                }
            }
        }
        return count++;
    }
}