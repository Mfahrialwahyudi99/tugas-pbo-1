package transpose;

class Print2dArray {
    public static void print2dArray(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int c = 0; c < matrix[0].length; c++) {
                System.out.print(ints[c] + "\t");
            }
            System.out.println();
        }
    }
}

