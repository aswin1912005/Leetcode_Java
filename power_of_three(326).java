class Solution {
    public boolean isPowerOfThree(int n) {
        int j;
        if(n==1)
        return true;
        for(int i=1;Math.pow(3, i) <= n;i++){
            j=(int) Math.pow(3,i);
            if (j==n)
            return true;
            else
            continue;
        }
        return false;
    }
}
