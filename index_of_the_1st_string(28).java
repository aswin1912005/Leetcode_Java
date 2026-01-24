class Solution {
    public int strStr(String haystack, String needle) {
        int x = haystack.length();
        int y = needle.length();
        if (y == 0)
            return 0;

        for (int i = 0; i <= x - y; i++) {
            int j = 0;
            while (j < y && haystack.charAt(i + j) == needle.charAt(j))
                j++;

            if (y == j)
                return i;
        }
        return -1;
    }
}
