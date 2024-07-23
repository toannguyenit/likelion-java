package vn.edu.likelion.app.Day13.Excercise;

import java.util.function.Function;
import java.util.function.Predicate;

public class Bai1 {
    static Predicate<Integer> isPrime = num -> {
        if (num == 2 || num == 3) return true;
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    };
    static Function<Integer, Integer> divisorPrimeMax = num -> {
        int max = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && isPrime.test(i) && i >= max) {
                max = i;
            }
        }
        return max;
    };
    public static void main(String[] args) {
        int a = 176;
        int b = 36;
        System.out.println("Number : " + a );
        System.out.println("Largest prime factory: " + divisorPrimeMax.apply(a));
        System.out.println("");
        System.out.println("Number : " + b );
        System.out.println("Largest prime factory: " + divisorPrimeMax.apply(b));

    }
}
