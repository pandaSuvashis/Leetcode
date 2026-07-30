class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix[0].length;
        int m = matrix.length;

        int startingRow = 0;
        int endingRow = m - 1;

        int startingCol = 0;
        int endingCol = n - 1;

        List<Integer> res = new ArrayList<>();

        while (startingRow <= endingRow &&
               startingCol <= endingCol) {

            // 1. Left -> Right
            for (int i = startingCol; i <= endingCol; i++) {
                res.add(matrix[startingRow][i]);
            }
            startingRow++;

            // 2. Top -> Bottom
            for (int j = startingRow; j <= endingRow; j++) {
                res.add(matrix[j][endingCol]);
            }
            endingCol--;

            // 3. Right -> Left
            if (startingRow <= endingRow) {

                for (int i = endingCol; i >= startingCol; i--) {
                    res.add(matrix[endingRow][i]);
                }

                endingRow--;
            }

            // 4. Bottom -> Top
            if (startingCol <= endingCol) {

                for (int j = endingRow; j >= startingRow; j--) {
                    res.add(matrix[j][startingCol]);
                }

                startingCol++;
            }
        }

        return res;
    }
}