package bagian4;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        // Konversi String ke number
        String contoh = "10000"; // jika string nya bukan angka, maka error

        Integer contohInt = Integer.valueOf(contoh); // Jika menggunakan int maka (.parseAt), Jika Integer maka (.valueOf)
        System.out.println(contohInt);

        String contoh2 = "100.10";
        Double contoh2Int = Double.valueOf(contoh2);
        System.out.println(contoh2Int);
    }
}
