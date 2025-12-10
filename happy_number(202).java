class Solution {
    public boolean isHappy(int n) {
        int sum = 0, x;
        String s = String.valueOf(n);
        int i = 0;

        if (n == 1)
            return true;

        while (true) {
            x = s.charAt(i) - '0';
            sum += (x * x);
            i++;

            if (i == s.length()) {  
                if (sum == 1)
                    return true;

                if (sum == 4)   
                    return false;

                s = String.valueOf(sum);
                i = 0;
                sum = 0;
            }
        }
    }
}
