package co.sebashepin.hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class AVeryBigSum {

    static long aVeryBigSum(int n, long[] ar) {
        // Complete this function
        return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }

}
