package vn.edu.likelion.app.Day9;

import java.util.Arrays;
import java.util.LinkedList;

public class Bai1 {

    static void bubbleSortCustom(int[] a) {
        int n = a.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] == 0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    static void sortCustom2(int[] a) {
        int[] temp = new int[a.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0) {
                temp[count++]= a[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }

    static void sortCustom1(int[] arr) {
        bubbleSortCustom(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 3, 0, 5, 0, 6};
        sortCustom2(arr);


        // Cach 2
//        LinkedList<Integer> list = new LinkedList<>();
//        list.addLast(0);
//        list.addLast(0);
//        list.addLast(1);
//        list.addLast(0);
//        list.addLast(3);
//        list.addLast(0);
//        list.addLast(5);
//        list.addLast(0);
//        list.addLast(6);
//        System.out.println("Trước khi dịch chuyển: " + list);
//
//        LinkedList<Integer> temp = new LinkedList<>();
//        for (Integer i : list) {
//            temp.addFirst(i);
//        }
//        for (Integer currentInt : temp) {
//            if (currentInt == 0) {
//                list.remove(currentInt);
//                list.addLast(currentInt);
//            }
//        }
//        System.out.println("Sau khi dịch chuyển: " + list);
    }
}
