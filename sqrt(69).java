class Solution {
    public int mySqrt(int x) {
        if(x>=0){
        double y=Math.floor(Math.sqrt(x));
        x=(int) y;
        return x;
        }
        else{
            return x;
        }
    }
}
