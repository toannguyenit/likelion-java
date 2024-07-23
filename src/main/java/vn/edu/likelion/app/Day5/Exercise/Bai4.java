package vn.edu.likelion.app.Day5.Exercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai4 {
    static String filterAndRemoveDuplicatesCharacters(String str) {
        String result = "";
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
          if(set.add(String.valueOf(str.charAt(i)))) {
              result += str.charAt(i);
          }
        }
        return result;
    }
    public static void main(String[] args) {
//        Neu khong muon nhap co the dung input ben duoi de test nhanh bang cach loai bo cac comment ben duoi
//        String str = "characters";
//        System.out.println(filterAndRemoveDuplicatesCharacters(str));

        Scanner sc = new Scanner(System.in);
        System.out.print("Vui long nhap chuoi str: ");
        String str = sc.nextLine();
        System.out.println(filterAndRemoveDuplicatesCharacters(str));

    }
}
