class Solution {
    public String simplifyPath(String path) {

        String s = "";
        char prev = ' ';

        for (int i = 0; i < path.length(); i++) {
            char cur = path.charAt(i);
            if (cur == '/' && prev == '/')
                continue;
            s += cur;
            prev = cur;
        }

        String[] parts = s.split("/");
        String[] temp = new String[parts.length];
        int top = -1;

        for (String p : parts) {
            if (p.equals("") || p.equals(".")) {
                continue;
            } 
            else if (p.equals("..")) {
                if (top >= 0)
                    top--;
            } 
            else {
                temp[++top] = p;
            }
        }

        if (top == -1)
            return "/";

        String ans = "";
        for (int i = 0; i <= top; i++) {
            ans += "/" + temp[i];
        }

        return ans;
    }
}
