class Solution {
    String result="";
    int count=0;
    void permutation(String s,String ans,int k){
        if(s.length()==0){
            count++;
            if(count==k) result+=ans;
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            permutation(left+right,ans+c,k);
        }
    }
    public String getPermutation(int n, int k) {
        String str="";
        for(int i=1;i<=n;i++){
            str+=String.valueOf(i);
        }
        permutation(str,"",k);
        return result;
    }
}