class Solution {
    public int lengthOfLongestSubstring(String s) {
        String ss = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (ss.contains(String.valueOf(c))) {
                ss = ss.substring(ss.indexOf(c) + 1);
            }

            ss += c;
            max = Math.max(max, ss.length());
        }
        return max;
    }
}
