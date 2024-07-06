package transpose;

public class Transpose {
    public static void transpose(int[][] data) {
        int row = data.length;
        int column = data[0].length;

        System.out.println("Elements of transpose matrix T are: ");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.print(data[c][r] + "\t");
            }
            System.out.println();
        }
    }
}