package no.kristiania.roman;

public class Roman {
    public static String convert(int i) {
        if (i == 1) {
            return "I";
        } else if (i == 2) {
            return "II";
        } else {
            return "";
        }
    }
}
