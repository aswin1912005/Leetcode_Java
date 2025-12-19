class Solution {
    public void reverseString(char[] s) {
        int j=s.length-1,i=0;
        char t;
        while(i<j){
            t=s[i];
            s[i]=s[j];
            s[j]=t;
            i++;
            j--;
        }
        
    }
}
