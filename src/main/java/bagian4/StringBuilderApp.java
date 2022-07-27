package bagian4;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Aera");
        builder.append(" ");
        builder.append("Hye");
        builder.append(" ");
        builder.append("Ren");

        String name = builder.toString();
        System.out.println(name);
    }
}
