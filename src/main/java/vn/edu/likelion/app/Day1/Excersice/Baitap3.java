package vn.edu.likelion.app.Day1.Excersice;

import java.util.Scanner;

public class Baitap3 {
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length(); i > 0; i--) {
            result += str.charAt(i - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap chuoi ky tu: ");
        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }
}
