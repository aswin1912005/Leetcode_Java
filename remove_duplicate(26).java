class Solution {
    public int removeDuplicates(int[] nums) {
        int count = nums.length;
        if (count == 0) return 0;

        int[] x = new int[count];
        int j = 0; 

        for (int i = 0; i < count; i++) {
            int kk = nums[i];

            if (!containsValue(kk, x, j)) {
                x[j] = kk;
                j++;
            }
        }

        for (int i = 0; i < j; i++) {
            nums[i] = x[i];
        }

        return j; 
    }

    boolean containsValue(int val, int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == val)
                return true;
        }
        return false;
    }
}
