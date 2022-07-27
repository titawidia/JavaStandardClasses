package bagian4;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(",", "[", "]");

        joiner.add("Aera");
        joiner.add("Hye");
        joiner.add("Ren");

        String value = joiner.toString();
        System.out.println(value);
    }
}
