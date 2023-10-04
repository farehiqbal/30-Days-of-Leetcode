class Solution {
    public int arraySign(int[] nums) {
        
        int negativeNumbers = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == 0) return 0;
            
            if(nums[i] < 0) negativeNumbers++;
        }
        
        
        // check if even
        return negativeNumbers % 2 == 0? 1 : -1;
    }
}