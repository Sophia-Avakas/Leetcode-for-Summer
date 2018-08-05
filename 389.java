public class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;
        for (int i = 0; i < s.length(); i++)
            result ^= s.charAt(i) - 'a';
        for (int i = 0; i < t.length(); i++)
            result ^= t.charAt(i) - 'a';
        return (char)('a' + result);
    }
}