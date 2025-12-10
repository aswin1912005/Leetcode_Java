class Solution {
    public boolean isPowerOfTwo(int n) {
        double i=1;
        double ans=1;
        if(n==1){
            return true;
        }
        while(true){
            ans=Math.pow(2,i);
            i++;
            if(ans==n)
            break;
            else if(ans>n)
            break;
        }
        if (ans==n)
            return true;
            else 
            return false;
    }
}
