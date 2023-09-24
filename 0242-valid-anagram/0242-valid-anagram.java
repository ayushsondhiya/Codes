class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] char_1 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char_1[s.charAt(i) - 'a']++;
            char_1[t.charAt(i) - 'a']--;
        }
        for (int count : char_1) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
