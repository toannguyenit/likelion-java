package vn.edu.likelion.app.Day4.Exercise;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Bai1 {
//    public static String findNonRepeatingChar1(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            int count = 0;
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    count++;
//                    if (count == 2) break;
//                }
//            }
//            if (count < 2) {
//                return String.valueOf(str.charAt(i));
//            }
//        }
//        return "Not found!";
//    }
    public static String findNonRepeatingChar2(String string) {
        int index = -1;
        char fnc = ' ';

        if(string.length()==0){
            return ("EMPTY STRING");
        }

        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                fnc = i;
                break;
            }
            else {
                index += 1;
            }
        }
        if (index == string.length()-1) {
            return ("All characters are repeating");
        }
        else {
            return ("First non-repeating character is " + fnc);
        }
    }
//    public static String findNonRepeatingChar3(String str) {
//        Set<Character> set = new HashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//                    set.add(str.charAt(i));
//        }
//        System.out.println(set.toString());
//        return "Not found!";
//    }

    public static void main(String[] args) {
        String str = "gibblegabbler";
        String str1 = "ccca";
        String str2 = "gggagg";
        System.out.println(findNonRepeatingChar2(str));;
    }
}
