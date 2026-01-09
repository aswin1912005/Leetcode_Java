class Solution {
    public String thousandSeparator(int n) {
         String s=String.valueOf(n);
        if(s.length()<=3)
        return s;
        String f="";
        int c=s.length();
        int i=0;
        for(int j=c-1;j>=0;j--){
            i++;
            f+=s.charAt(j);
            if(i==3&&j!=0){
                f+=".";
                i=0;
            }
        }
        return new StringBuilder(f).reverse().toString();
    }
}
