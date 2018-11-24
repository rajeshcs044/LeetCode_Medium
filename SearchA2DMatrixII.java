package com.rajesh.practice.medium;

public class SearchA2DMatrixII
{
    public static boolean searchMatrix(int[][] matrix, int target)
    {
        int rows = matrix.length;
        if (rows == 0)
        {
            return false;
        }
        int cols = matrix[0].length;

        int i = 0;
        int j = cols - 1;

        while (i < rows && j > -1)
        {
            if (matrix[i][j] == target)
            {
                return true;
            }
            else if (matrix[i][j] < target)
            {
                i = i + 1;
            }
            else
            {
                j = j - 1;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[][] a = { { -5 } };
        System.out.println("Result: " + searchMatrix(a, -5));
    }
}
