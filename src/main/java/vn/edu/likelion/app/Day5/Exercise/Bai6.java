package vn.edu.likelion.app.Day5.Exercise;

import java.util.Scanner;

public class Bai6 {

    static void ValidException(int[] arrayInt, int n){
        for(int i=0;i<arrayInt.length;i++){
            if(n==arrayInt[i]){
                throw new ArithmeticException("So nay da duoc nhap roi, vui long nhap lai");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap n phan tu cua mang, n = ");
        int n = sc.nextInt();
        int[] arrayInt = new int[n];
        for(int i=0;i<n;i++){
            try {
                System.out.print("Nhap phan tu thu " + i + ": ");
                arrayInt[i] = sc.nextInt();
                ValidException(arrayInt, n);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
                i--;
            }

        }
    }
}
