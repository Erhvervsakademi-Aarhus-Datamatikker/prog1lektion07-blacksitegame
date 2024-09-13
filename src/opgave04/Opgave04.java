package opgave04;

import java.util.Scanner;

public class Opgave04 {
    public static void main(String[] args) {
        char[] romanNumber = {'M', 'L', 'X', 'I'}; //1061
        System.out.println(romanNumberToArabicNumber(romanNumber));
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write 4 Roman numerals in upper case: ");
        char numeral1 = scanner.next().charAt(0);
        char numeral2 = scanner.next().charAt(0);
        char numeral3 = scanner.next().charAt(0);
        char numeral4 = scanner.next().charAt(0);
        char[] romanNumber2 = {numeral1, numeral2, numeral3, numeral4};
        System.out.println(romanNumberToArabicNumber(romanNumber2));


    }

    private static int romanNumberToArabicNumber(char[] romanNumber) {
        //Din implementering her.
        int result = 0;

        for (int i = 0; i < romanNumber.length; i++) {
            if (i > 0) {

                if (SingleRomanNumberToArabicNumber(romanNumber[i]) > SingleRomanNumberToArabicNumber(romanNumber[i - 1])) {
                    result += SingleRomanNumberToArabicNumber(romanNumber[i]) - 2;
                }
                else {
                    result += SingleRomanNumberToArabicNumber(romanNumber[i]);
                }
            }
            else {
                result += SingleRomanNumberToArabicNumber(romanNumber[i]);
            }


        }

        return result;
    }

    private static int SingleRomanNumberToArabicNumber(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException(roman + " is not a valid roman number literal.");
        };
    }
}
