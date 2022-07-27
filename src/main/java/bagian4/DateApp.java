package bagian4;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Date tanggal = new Date();

        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2010); // .set untuk mengganti
        calendar.set(Calendar.MONTH, Calendar.JANUARY); // .add untuk menambahkan atau mengurangi waktu
        calendar.set(Calendar.HOUR_OF_DAY, 10);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
