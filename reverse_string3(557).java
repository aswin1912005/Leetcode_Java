class Solution {
    public String reverseWords(String s) {
        String ss="",ans="";
        int i;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                ss+=s.charAt(i);
            }
            else{
                ans+=new StringBuilder(ss).reverse().toString();
                ans+=" ";
                ss="";
            }
        }
        ans += new StringBuilder(ss).reverse().toString();

        return ans;
    }
}
