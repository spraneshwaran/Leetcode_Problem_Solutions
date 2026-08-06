class Solution {
    public int findSpecialInteger(int[] arr) {
        int val=arr[0];
        int count=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]) count++;
            else count=1;
            if(count>arr.length/4){
                val=arr[i];
            }
        }
        return val;
    }
}