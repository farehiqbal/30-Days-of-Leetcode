class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;
        int row = mat.length;

        for(int i = 0; i < mat.length; i++){     
                sum += mat[i][i];
                sum += mat[i][row-i-1];
            
        }

        return row % 2 == 0 ? sum : sum- mat[row/2][row/2];
    }
}