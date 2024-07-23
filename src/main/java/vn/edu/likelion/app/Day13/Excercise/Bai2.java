package vn.edu.likelion.app.Day13.Excercise;

import java.util.function.Function;

public class Bai2 {
    public static Function<Integer, String> integerToString = number -> Integer.toBinaryString(number);

    public static String integerToBinaryString(Integer number) {
        String result = "";
        while (number > 0) {
            result += integerToBinaryString(number % 2);
            number /= 2;
        }
        return result;
    }

    public static Function<Integer, String> integerToBinaryString = number -> {
        String result = "";
        while (number > 0) {
            result = (number % 2) + result;
            number /= 2;
        }
        return result;
    };

    public static String integerToBinaryString2(int number, int count, String result) {
        number  = number - (int )Math.pow(2.0, count);
        if (number == 0) {
            return result;
        }
        if (number < 0) {

        }
        return integerToBinaryString2(number, ++count, result) + result;
    }

    public static boolean isValidNext(int number, int count) {
        if (Math.pow(2, count) > number) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a = 75;
        System.out.println("Number: " + a);
        System.out.println("Binary representation 1: " + integerToString.apply(a));
        System.out.println("Binary representation 2: " + integerToBinaryString.apply(a));
    }
}
