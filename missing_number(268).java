class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int act=n*(n+1)/2;
        int get = 0;
        for (int i = 0; i < nums.length; i++) {
            get += nums[i];
        }
        int ans=get-act;
        return Math.abs(ans);
    }
}
