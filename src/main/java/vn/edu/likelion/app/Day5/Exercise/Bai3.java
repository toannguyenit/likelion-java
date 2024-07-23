package vn.edu.likelion.app.Day5.Exercise;

public class Bai3 {

    static void printCountAndEvenElement(int[] intArray){
        int countOldElement = 0;
        int countEvenElement = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0){
                countEvenElement++;
            }
            else {
                countOldElement++;
            }
        }
        System.out.println("Number of even elements: " + countEvenElement + " Number of odd elements: " + countOldElement);
    }

    public static void main(String[] args) {
//        Neu khong muon nhap co the dung mang ben duoi de test nhanh bang cach loai bo 2 comment ben duoi
        int[] intArray = {1,2,3,4,5,6,7,8,9};
        printCountAndEvenElement(intArray);


    }
}
