package ca.ciccc.wmad.assignment3.question10;

import java.util.Arrays;

public class Question10 {

    public boolean checkSingleFactorEquality(int[] s1, int[] s2) {
        return Arrays.equals(s1, s2);
    }

    public boolean checkPolynomialEquationsEquality(int[] p1, int[] p2) {
        return Arrays.equals(p1, p2);
    }

    public int findBiggestExponentValue(int[] p) {
        int biggestExponentValue = 0;

        for (int i = 0; i < p.length; i++) {
            if (p[i] != 0) biggestExponentValue = i;
        }

        return biggestExponentValue;
    }

    public void combineTwoPolynomialEquations(int[] p1, int[] p2) {
        int[] result = new int[11];

        for (int i = 0; i < p1.length; i++) {
            for (int i1 = 0; i1 < p2.length; i1++) {
                if (i == i1) {
                    result[i] = p1[i] + p2[i1];
                }
            }
        }

        int printCount = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            if (i == 0) {
                if (result[i] != 0) {
                    if (printCount == 0 || result[i] < 0) {
                        System.out.printf("%d", result[i]);
                    } else {
                        System.out.printf("+%d", result[i]);
                    }
                    printCount++;
                }
            } else if (i == 1) {
                if (result[i] != 0) {
                    if (printCount == 0 || result[i] < 0) {
                        System.out.printf("%dx", result[i]);
                    } else {
                        System.out.printf("+%dx", result[i]);
                    }
                    printCount++;
                }
            } else {
                if (result[i] != 0) {
                    if (printCount == 0 || result[i] < 0) {
                        System.out.printf("%dx^%d", result[i], i);
                    } else {
                        System.out.printf("+%dx^%d", result[i], i);
                    }
                    printCount++;
                }
            }
        }

        System.out.println();
    }
}
}
