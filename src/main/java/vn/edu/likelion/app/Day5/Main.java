package vn.edu.likelion.app.Day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
        String chuoi = "abc";
        convertStringToInt(chuoi);
        System.out.println("App vẫn chạy đến đây");
    }

    /**
     * @param chuoi
     * @return
     * @throws NumberFormatException
     */
    static int convertStringToInt(String chuoi) throws NumberFormatException {
        int i = 0;
        try {
            i = Integer.parseInt(chuoi);
        } catch (NumberFormatException e) {

        }
        return i;
    }

    static void readFile() throws FileNotFoundException {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("abc."));
            System.out.println("abc");
            throw new FileNotFoundException();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

}