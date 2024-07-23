package vn.edu.likelion.app.Day9;

public class Bai3 {

    static int findFirstDigitOfNumber(int number) {
        boolean negative = number < 0;
        number = Math.abs(number);
        int quotient = number / 10;
        if (quotient < 10 ) return quotient;
        return negative ? -findFirstDigitOfNumber(quotient) : findFirstDigitOfNumber(quotient);
    }

    static int findFirstDigitOfNumber2(int number){
        boolean negative = number < 0;
        number = Math.abs(number);
        while (number >= 10) {
            number /= 10;
        }
        return negative ? -number : number;
    }


    public static void main(String[] args) {
        int a = -200063;
        System.out.println("Input an integer (positve/negative) : " + a);
        System.out.println("Extract the first digit from the said integer");
        System.out.println(findFirstDigitOfNumber2(a));
    }
}
