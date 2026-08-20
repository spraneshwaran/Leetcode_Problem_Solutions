class Solution {
    public boolean canBeEqual(String s1, String s2) {
        var s1Array = s1.toCharArray();
        var s2Array = s2.toCharArray();
        var a02 = s1Array[0] == s2Array[2] && s1Array[2] == s2Array[0];
        var b02 = s1Array[0] == s2Array[0] && s1Array[2] == s2Array[2];
        var a13 = s1Array[1] == s2Array[3] && s1Array[3] == s2Array[1];
        var b13 = s1Array[1] == s2Array[1] && s1Array[3] == s2Array[3];
        return (a02 || b02) && (a13 || b13);
    }
}