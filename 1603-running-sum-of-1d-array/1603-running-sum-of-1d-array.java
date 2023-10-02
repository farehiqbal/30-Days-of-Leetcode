class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            int sum = 0;
            
            for(int j = 0;j <= i ;j++){
                sum += nums[j];
            }

            res[i] = sum;
        }
        return res;
    }
}