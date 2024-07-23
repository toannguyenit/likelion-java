package vn.edu.likelion.app.Day14.Exercise;

import java.util.Arrays;
import java.util.function.Predicate;

public class Bai1 {

//    static Predicate<String> isPalidrome = (str) ->{
//        if (str == null || str.length() == 0) {
//            System.out.println("Chuỗi rỗng!");
//            return false;
//        }
//        int left = 0, right = str.length() - 1;
//        while (left <= right) {
//            if (str.charAt(left++) != str.charAt(right--)) {
//                return false;
//            }
//        }
//        return true;
//    };

    static Predicate<String> isPalidrome = new Predicate<>() {
        @Override
        public boolean test(String str) {
            if (str == null || str.length() == 0) {
            System.out.println("Chuỗi rỗng!");
            return false;
        }
        int left = 0, right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
        }
    };

    public static void main(String[] args) {
        String str1 = "Madam";
        String str2 = "radar";
        String str3 = "defied";

        System.out.println(str1 + "is a Palidrome? " + isPalidrome.test(str1));
        System.out.println(str2 + "is a Palidrome? " + isPalidrome.test(str2));
        System.out.println(str3 + "is a Palidrome? " + isPalidrome.test(str3));
    }

}
