package vn.edu.likelion.app.Day18.Lession;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 8,7, 9};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int currentIndex = left - 1 ;
        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot) {
                currentIndex++;
                swap(arr, currentIndex, i);
            }
        }
        swap(arr, currentIndex+1, right);
        return currentIndex + 1;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }
}
