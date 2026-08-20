class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        char a[]=s1.toCharArray();
        char temp=a[0];
        a[0]=a[2];
        a[2]=temp;
        if(String.valueOf(a).equals(s2)) return true;
        char b[]=s1.toCharArray();
        temp=b[1];
        b[1]=b[3];
        b[3]=temp;
        if(String.valueOf(b).equals(s2)) return true;
        temp=b[0];
        b[0]=b[2];
        b[2]=temp;
        return (String.valueOf(b).equals(s2))?true:false;
    }
}