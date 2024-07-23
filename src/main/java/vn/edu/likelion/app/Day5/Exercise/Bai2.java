package vn.edu.likelion.app.Day5.Exercise;

import java.util.Scanner;

public class Bai2 {

    static String printEachLetterTwice(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            result += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i)) ;
        }
        return result;
    }


    public static void main(String[] args) {
//        Neu khong muon nhap co the dung mang ben duoi de test nhanh bang cach loai bo 2 comment ben duoi
//        String str = "hello";
//        System.out.print("Ket qua: " + printEachLetterTwice(str));


        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap chuoi: ");
        String str = sc.nextLine();
        System.out.print("Ket qua: " + printEachLetterTwice(str));

    }
}
