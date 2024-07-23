package vn.edu.likelion.app.Day5.Exercise;

import java.util.Scanner;

public class Bai5 {
    static void swapTwoStringsAndPrint(String str1, String str2) {
            str1 = str2 + str1;
            str2 = str1.substring(str2.length(), str1.length());
            str1 = str1.substring(0, str2.length());
         System.out.println("str1 = " + str1+", str2 = " + str2);;
    }
    public static void main(String[] args) {
//        Neu khong muon nhap co the dung input ben duoi de test nhanh bang cach loai bo cac comment ben duoi
//        String str1 = "Hello";
//        String str2 = "World";
//        swapTwoStringsAndPrint(str1, str2);

        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap chuoi str1: ");
        String str1 = sc.nextLine();
        System.out.print("Vui long nhap chuoi str2: ");
        String str2 = sc.nextLine();
        swapTwoStringsAndPrint(str1, str2);





    }
}
