package co.sebashepin.hackerrank.algorithms;

import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
public class CompareTheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] scores = new int[]{0,0};
        scores = compareAndScore(scores, a0, b0);
        scores = compareAndScore(scores, a1, b1);
        scores = compareAndScore(scores, a2, b2);
        return scores;
    }

    static int[] compareAndScore(int[] scores, int alice, int bob)
    {
        if(alice > bob)
            return new int[]{scores[0]+1, scores[1]};
        else if(alice < bob)
            return new int[]{scores[0], scores[1]+1};
        else
            return scores;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
