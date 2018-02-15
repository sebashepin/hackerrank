package co.sebashepin.hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    static String staircase(int n) {
        if(n==0)
            return "\n";

        StringBuilder staircase = new StringBuilder();
        for(int i = 0; i< n; i++) {
            staircase.append(generateLine(n-i-1, n));
        }

        return staircase.toString();
    }

    static String generateLine(int lineNumber, int n)
    {
        StringBuilder line = new StringBuilder();
        for(int i = 0; i < lineNumber; i++)
        {
            line.append(' ');
        }

        for(int i = lineNumber; i< n; i++)
        {
            line.append('#');
        }

        if(lineNumber != 0)
            line.append('\n');

        return line.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(staircase(n));
        in.close();
    }
}
