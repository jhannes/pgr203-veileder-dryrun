package no.kristiania.roman;

public class Roman {
    public static String convert(int number) {
        String result = "";

        for (int i = 0; i < number; i++) {
            result += "I";
        }

        return result;
    }
}
