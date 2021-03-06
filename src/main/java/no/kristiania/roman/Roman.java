package no.kristiania.roman;

public class Roman {
    public static String convert(int number) {
        StringBuilder result = new StringBuilder();

        number = convertDigit(number, result, 1000, "M");
        number = convertDigit(number, result, 900, "CM");
        number = convertDigit(number, result, 500, "D");
        number = convertDigit(number, result, 400, "CD");
        number = convertDigit(number, result, 100, "C");
        number = convertDigit(number, result, 90, "XC");
        number = convertDigit(number, result, 50, "L");
        number = convertDigit(number, result, 40, "XL");
        number = convertDigit(number, result, 10, "X");
        number = convertDigit(number, result, 9, "IX");
        number = convertDigit(number, result, 5, "V");
        number = convertDigit(number, result, 4, "IV");
        convertDigit(number, result, 1, "I");

        return result.toString();
    }

    private static int convertDigit(int number, StringBuilder result, int digitValue, String digitSymbol) {
        while (number >= digitValue) {
            result.append(digitSymbol);
            number -= digitValue;
        }
        return number;
    }
}
