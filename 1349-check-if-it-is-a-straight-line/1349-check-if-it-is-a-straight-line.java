class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
            return true; // Any two points are collinear
        }

        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            int dx2 = coordinates[i][0] - coordinates[i - 1][0];
            int dy2 = coordinates[i][1] - coordinates[i - 1][1];

            if (dx2 * dy != dx * dy2) {
                return false; // Points are not collinear
            }
        }

        return true; // All points are collinear
    }


}