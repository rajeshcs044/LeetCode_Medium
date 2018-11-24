package com.rajesh.practice.medium;

public class SetMatrixZeroes
{
    public void setZeroes(int[][] matrix)
    {
        int rows = matrix.length;
        if (rows == 0)
        {
            return;
        }
        int cols = matrix[0].length;

        int[] zeroRows = new int[rows];
        int[] zeroCols = new int[cols];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (matrix[i][j] == 0)
                {
                    zeroRows[i] = 1;
                    zeroCols[j] = 1;
                }
            }
        }

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (zeroRows[i] == 1 || zeroCols[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
