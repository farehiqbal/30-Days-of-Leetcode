class Solution {
    public int[] plusOne(int[] digits) {
        
        if(areAllElementsNine(digits)){
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            
            for(int i = 1; i<arr.length;i++){
                arr[i] = 0;
            }
            
            return arr;
        }
        
        for(int i = digits.length- 1; i >= 0; i--){
            
            if(digits[i] == 9){
                digits[i] = 0; 
            }
            
            else{
                digits[i]++;
                return digits;
            }
        }
        
        return digits;
        
        
    }
    
    
    public static boolean areAllElementsNine(int[] arr) {
        for (int element : arr) {
            if (element != 9) {
                return false; // Found an element that is not 9,                                    return false
            }
        }
        return true; // All elements are 9
    }
}