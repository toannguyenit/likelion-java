package vn.edu.likelion.app.Day1.Lession;

import java.util.Scanner;

public class HelloWorld {

    static void printTypeString(String message) {
        System.out.println(message);
    }


    public static void main(String[] arg) {
//      Bài 1
//      System.out.println("Hello World!");
//      System.out.println("I am learning Java!");


//      Bài 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui lòng nhập chuỗi bất kỳ: ");
        String message = scanner.nextLine();
        printTypeString(message);
    }
}