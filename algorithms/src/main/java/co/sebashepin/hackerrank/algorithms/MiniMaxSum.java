package co.sebashepin.hackerrank.algorithms;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Stream;


public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        Arrays.sort(arr);

        long min = Arrays.stream(arr).limit(4).asLongStream().sum();
        long max = Arrays.stream(arr).skip(1).asLongStream().sum();

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }

}
