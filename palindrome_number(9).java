class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        if(s.charAt(0)=='-')
        return false;
        int j=s.length();
        String ss="";
        for(int i=j-1;i>=0;i--){
            ss+=s.charAt(i);
        }
        if(s.equals(ss))
        return true;
        else{
            return false;
        }
    
    }
}
