package vn.edu.likelion.app.Day5.Lession.ThrowAndThows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowAndThrows {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Tuổi phải từ 18 trở lên."); // Ném IllegalArgumentException
        } else {
            System.out.println("Tuổi hợp lệ.");
        }
    }

    static void showDivision() throws ArithmeticException, NumberFormatException{
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first number a = ");
            int a = scanner.nextInt();
            System.out.println("Enter the second number b = ");
            int b = scanner.nextInt();
            System.out.println("Ket qua cua phep chia a/b: " + (a/b) );}
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        try{
            checkAge(15);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        showDivision();
        System.out.println("Code chay o day");
    }
}
