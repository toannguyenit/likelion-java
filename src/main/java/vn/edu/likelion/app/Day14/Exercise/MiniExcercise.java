package vn.edu.likelion.app.Day14.Exercise;

import java.util.Arrays;
import java.util.function.Function;

public class MiniExcercise {
    static Function<double[], Double> average =
            (doubles) -> Arrays.stream(doubles).reduce(0, (a, b) -> a + b) / doubles.length;


    public static void main(String[] args) {
        Double[] a = new Double[10];
        double[] doubles = {1.2, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5};
//        System.out.println(Arrays.stream(doubles)
//                .average()
//                .getAsDouble()
//                );

        double result = average.apply(doubles);
        System.out.println(result);
    }
}
