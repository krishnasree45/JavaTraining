import java.util.Scanner;

public class FirstAndSecondMaximum {

    private static void fillMatrix(int[][] matrix, int numberOfRows, int numberOfColumns)
    {
        Scanner matrixElements = new Scanner(System.in);
        for(int row = 0; row < numberOfRows; row++)
        {
            for(int column = 0; column < numberOfColumns; column++)
            {
                matrix[row][column] = matrixElements.nextInt();
            }
        }
    }

    private static void findFirstAndSecondMax(int[][] matrix)
    {
        int firstMaximum = Integer.MIN_VALUE;
        int secondMaximum = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int matrixValue : row) {
                if(firstMaximum < matrixValue)
                {
                    secondMaximum = firstMaximum;
                    firstMaximum = matrixValue;
                }
                else if(secondMaximum < matrixValue)
                {
                    secondMaximum = matrixValue;
                }
            }
        }
        System.out.println("First maximum: " + firstMaximum + " Second maximum: " + secondMaximum);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the order of the matrix");
        Scanner matrixOrder = new Scanner(System.in);
        int numberOfRows = matrixOrder.nextInt();
        int numberOfColumns = matrixOrder.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        System.out.println("Enter the elements of the matrix");

        fillMatrix(matrix, numberOfRows, numberOfColumns);
        findFirstAndSecondMax(matrix);
    }
}
