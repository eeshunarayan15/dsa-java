package SearchingIn2DArray.example1;

public class SortedMatrix {
    public static void main(String[] args) {

    }

    static int[] search(int[][] matrix, int target) {

        int rows = matrix.length;
        int col = matrix[0].length;//be cautious here /matrix may be empty

        if (rows == 1) {

        }
        return new int[]{1, 2};
    }

    static int[] binarySearch(int matrix[][], int target, int row, int cStart, int cEned) {

        while (cStart <= cEned) {
            int mid = cStart + (cEned - cStart) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;

            } else {
                cEned = mid - 1;

            }
        }
        return new int[]{-1, -1};
    }
}
