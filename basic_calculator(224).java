class Solution {
    int i = 0;  

    public int calculate(String s) {
        return helper(s);
    }

    private int helper(String s) {
        int num = 0;
        int result = 0;
        int sign = 1;

        while (i < s.length()) {
            char c = s.charAt(i);
            i++;

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            }
            else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            }
            else if (c == '(') {
                num = helper(s); 
            }
            else if (c == ')') {
                result += sign * num;
                return result;    
            }
        }

        result += sign * num;
        return result;
    }
}
