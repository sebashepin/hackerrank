package co.sebashepin.hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0,2));
        String remainder = s.substring(2,s.length()-2);
        if(s.charAt(s.length()-2) == 'P')
        {
            if(hour == 12){
                hour = 0;
            }
            
            hour+=12;
        }
        else if(hour == 12)
        {
            hour = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("00");
        return decimalFormat.format(hour)+remainder;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
