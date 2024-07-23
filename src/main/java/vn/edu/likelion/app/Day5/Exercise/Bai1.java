package vn.edu.likelion.app.Day5.Exercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai1 {
    static int filterDistinctAndReturnSum(int[] intArray){
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < intArray.length; i++) {
            if (set.add(intArray[i])) {
                sum += intArray[i];
            };
        }
        return sum;
    }

    public static void main(String[] args) {
//         Neu khong muon nhap co the dung mang ben duoi de test nhanh bang cach loai bo 2 comment ben duoi
//         int[] intArray = {5,1,8,4,9,1,5};
//         System.out.println(filterDistinctAndReturnSum(intArray));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap so phan tu cua mang: n = ");
        int n = scanner.nextInt();
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Hay nhap gia tri thu " + (i+1) + " cua mang: ");
            intArray[i] = scanner.nextInt();
        }
        System.out.println("Tong cac gia tri trong mang la " + filterDistinctAndReturnSum(intArray));
    }

}
