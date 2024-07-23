package vn.edu.likelion.app.Day5.Lession.TryCatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatchLession {


    public static void main(String[] args){

        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        }catch (RuntimeException ex){
            System.out.println("Error: " + ex.getMessage());
//            ex.printStackTrace();
        }
        finally {
            System.out.println("Xin chao");
        }
    }

}
