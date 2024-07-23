package vn.edu.likelion.app.Day14.Exercise;

import java.util.Arrays;
import java.util.function.Function;

public class Bai2 {
    static Function<int[], int[]> findSecondMaxAndMin = (arr) -> {
        int[] result = new int[2];
        int max = arr[0];
        int secondMax = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        result[0] = secondMax;
        result[1] = min;
        return result;
    };


    public static void main(String[] args) {
        int[] arr = {1, 7, 18, 25, 77, 300, 101};

        System.out.println("Array element: " + Arrays.toString(arr));
        System.out.println("Second Largest element: " + findSecondMaxAndMin.apply(arr)[0]);
        System.out.println("The smallest element: " + findSecondMaxAndMin.apply(arr)[1]);


//        int second = Arrays.stream(arr).sorted();


        int a = 1;
        double b = 1.0;

        System.out.println(a==b);
    }
}
