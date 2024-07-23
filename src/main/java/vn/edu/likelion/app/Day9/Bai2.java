package vn.edu.likelion.app.Day9;

public class Bai2 {

    static void checkOddOrEvenOfStringNumber1(int number) {
        number = Math.abs(number);
        System.out.println("Input an integer: " + number);
        System.out.println("Check whether every  digit of the said integer is odd or not!");
        String stringNumber = String.valueOf(number);
        int charCurrent;
        for (int i = 0; i < stringNumber.length(); i++) {
            charCurrent = Integer.valueOf(stringNumber.charAt(i));
            if (charCurrent % 2 == 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    static boolean checkDigitOfNumberIsOdd(int number) {
        number = Math.abs(number);
        int quotient = number / 10;
        int remainder = number % 10;
        if ((remainder & 1) == 0) return false;
        if (quotient > 0 ) return checkDigitOfNumberIsOdd(quotient);
        return true;
    }

    static void checkOddOrEvenOfStringNumber2(int number) {
        number = Math.abs(number);
        System.out.println("Input an integer: " + number);
        System.out.println("Check whether every  digit of the said integer is odd or not!");

        System.out.println(checkDigitOfNumberIsOdd(number));

    }

    static void checkOddOrEvenOfStringNumber3(int number){
        System.out.println("Input an integer: " + number);
        System.out.println("Check whether every  digit of the said integer is odd or not!");
        number = Math.abs(number);
        int remainder ;
        while (number > 0) {
            remainder = number % 10;
            if (remainder % 2  == 0)  {
                System.out.println(false);
                return;
            }
            number /= 10;
        }
        System.out.println(true);
    }

    public static void main(String[] args) {
        int number = 1;
        checkOddOrEvenOfStringNumber1(number);


    }
}
