class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> mapp = new HashMap<>();
        
        mapp.put('I', 1);
        mapp.put('V', 5);
        mapp.put('X', 10);
        mapp.put('L', 50);
        mapp.put('C', 100);
        mapp.put('D', 500);
        mapp.put('M', 1000);
        
        int ans = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && mapp.get(s.charAt(i)) < mapp.get(s.charAt(i + 1))) {
                ans -= mapp.get(s.charAt(i));
            } else {
                ans += mapp.get(s.charAt(i));
            }
        }
        
        return ans;
    }//sanju
}