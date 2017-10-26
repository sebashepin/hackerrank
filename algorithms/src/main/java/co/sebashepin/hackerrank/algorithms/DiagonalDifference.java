package co.sebashepin.hackerrank.algorithms;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {

    static int absoluteDiagonalDifference(int n, int[][] matrix) {
        int cumulativeDifference = 0;
        for(int i = 0; i<n;i++){
            cumulativeDifference+=(matrix[i][i] - matrix[i][n-1-i]);
        }
        return Math.abs(cumulativeDifference);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i< n; i++){
            for (int j = 0; j<n; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        System.out.println(absoluteDiagonalDifference(n, matrix));
    }
}
