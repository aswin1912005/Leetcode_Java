class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        int n=s.length()-1;
        while(n>=0){
            if(s.charAt(n)==' ')
            n--;
            else
            break;
        }
        for(int i=n;i>=0;i--){
        
            if(s.charAt(i)==' '){
            
                break;
                
            }
            else{
                c++;
                continue;
               
            }
        }
        return c;
        
    }
}
