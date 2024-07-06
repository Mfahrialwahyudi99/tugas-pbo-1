package transpose;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Please enter the rows in the matrix");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Please enter the columns in the matrix");
        int column = sc.nextInt();

        int[][] first = new int[row][column];
        int[][] second = new int[row][column];

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter first[%d][%d] integer", r, c));
                first[r][c] = sc.nextInt();
            }
        }

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                System.out.println(String.format("Enter second[%d][%d] integer", r, c));
                second[r][c] = sc.nextInt();
            }
        }

        // close the scanner
        sc.close();

        // print both matrices
        System.out.println("First Matrix:\n");
        Print2dArray.print2dArray(first);

        System.out.println("Second Matrix:\n");
        Print2dArray.print2dArray(second);

        // sum and transpose of matrices

        Transpose.transpose(Sum.sum(first,second));
    }
}

