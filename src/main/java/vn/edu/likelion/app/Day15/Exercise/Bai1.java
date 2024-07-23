package vn.edu.likelion.app.Day15.Exercise;

import java.util.Arrays;
import java.util.function.Function;

public class Bai1 {

    static Function<int[], int[]> sumOddAndSumEven = x -> {
        int[] result = new int[2];
        result[0] = Arrays.stream(x).reduce(0, (a, b) -> {
            if (b % 2 == 0) {
                return a + b;
            }
            return a;
        });
        result[1] = Arrays.stream(x).reduce(0, (a, b) -> {
            if (b % 2 != 0) {
                return a + b;
            }
            return a;
        });
        return result;
    };

    static Function<int[], int[]> sumOddAndSumEven2 = x ->
            new int[]{
                    Arrays.stream(x).filter(i -> (i & 1) == 0).sum(),
                    Arrays.stream(x).filter(i -> (i & 1) != 0).sum()
            };


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14};
        System.out.println("List of even numbers: " + Arrays.toString(array));
        System.out.println("Sum of even numbers: " + sumOddAndSumEven.apply(array)[0]);
        System.out.println("Sum of odd numbers: " + sumOddAndSumEven.apply(array)[1]);

        System.out.println("");
        System.out.println("List of even numbers: " + Arrays.toString(array));
        System.out.println("Sum of even numbers: " + sumOddAndSumEven2.apply(array)[0]);
        System.out.println("Sum of odd numbers: " + sumOddAndSumEven2.apply(array)[1]);
    }
}
