package no.kristiania.roman;

public class Roman {
    public static String convert(int number) {
        String result = "";

        if (number == 5) {
            result += "V";
            number = 0;
        }
        if (number == 4) {
            result += "IV";
            number = 0;
        }

        for (int i = 0; i < number; i++) {
            result += "I";
        }

        return result;
    }
}
