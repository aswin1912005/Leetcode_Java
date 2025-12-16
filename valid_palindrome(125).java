class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]", "");
        String str=s;
        String sr="";
        int j=s.length()-1;
        for(int i=0;i<str.length();i++){
            sr+=str.charAt(j);
            j--;
        }
        return sr.equals(str);
    }
}
