public class Solution {
    public int RomanToInt(string s) {
        var result = 0;
        var romans = new Dictionary<char, int>();
        romans.Add('I', 1);
        romans.Add('V', 5);
        romans.Add('X', 10);
        romans.Add('L', 50);
        romans.Add('C', 100);
        romans.Add('D', 500);
        romans.Add('M', 1000);
        
        for (int i = 0; i < s.Length - 1; i++){
            if (romans[s[i]] < romans[s[i+1]]){
                result -= romans[s[i]];
            } else {
                result += romans[s[i]];
            }
        }
        return result + romans[s[s.Length - 1]];
    }
}