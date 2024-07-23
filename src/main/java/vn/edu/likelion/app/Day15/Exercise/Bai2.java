package vn.edu.likelion.app.Day15.Exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class Bai2 {
    static Function<int[], int[]> distinctElementOfArray = arr-> Arrays.stream(arr).distinct().toArray();
    static Function<int[], Set<Integer>> distinctElementOfArray2 = arr-> {
        Set<Integer> set = new HashSet<>();
        Arrays.stream(arr).forEach(i -> set.add(i));
        return set;
    };

    public static void main(String[] args) {
        int[] arr = {10, 23, 22, 23, 24, 24, 33, 15, 26, 15};
        System.out.println(Arrays.toString(distinctElementOfArray.apply(arr)));
        System.out.println(distinctElementOfArray2.apply(arr));


    }
}
