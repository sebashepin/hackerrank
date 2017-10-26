package co.sebashepin.hackerrank.algorithms;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */
public class PlusMinus {

    static int[] classifyNumbers(int n, int[] numbers) {
        int[] classification = new int[]{0,0,0};
        for (int number: numbers) {
            if(number>0)
                classification[0]++;
            else if(number<0)
                classification[1]++;
            else
                classification[2]++;
        }
        return classification;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<=0)
            return;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        int[] classification = classifyNumbers(n, numbers);
        DecimalFormat decimalFormat = new DecimalFormat("0.000000");
        for (int amount : classification) {
            System.out.println(decimalFormat.format(((double)amount)/((double)n)));
        }
    }
}
