package edu.mirea.pr1;

import java.util.Locale;

public class HarmonicSeries {
    public static void main(String[] args) {
        for (int denominator = 1; denominator <= 10; denominator++) {
            double term = 1.0 / denominator;
            System.out.printf(Locale.US, "%2d. 1/%d = %.5f%n", denominator, denominator, term);
        }
    }
}
