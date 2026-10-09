public class Solution {
    public string TruncateSentence(string s, int k) {
        string [] str=s.Split(' ');
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.Append(str[i]);
            sb.Append(" ");
        }
        return sb.ToString().Trim();
    }
}