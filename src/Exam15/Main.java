package Exam15;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String result = appendString();
        System.out.println(result);

        String[] a = sepString(result);
        System.out.println(a);

        System.out.println(createPath("c:\\javadev", "readme.txt"));
        System.out.println(createPath("c:\\javadev\\", "readme.txt"));

        regex("A01");
        regex("A00001D");
        regex("UABC");
        regex("UA0C");

        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        cal.set(Calendar.DAY_OF_MONTH, day + 100);
        SimpleDateFormat f = new SimpleDateFormat("西暦YYYY年MM月dd日");
        Date daysAfter100 = cal.getTime();
        System.out.println("\n" + f.format(daysAfter100));

        LocalDate l1 = LocalDate.now().plusDays(100);
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("西暦YYYY年MM月dd日");
        System.out.println("\n" + l1.format(f1));
    } 

    public static String appendString() {
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = 1; i < 100; i++) {
            sb.append(i + ",");
        }
        sb.append(i);
        return sb.toString();
    }

    public static String[] sepString(String str) {
        String[] a = str.split(",");
        return a;
    }

    public static String createPath(String folder, String file) {
        if (!folder.endsWith("\\")) {
            folder += "\\";
        }
        return folder + file;
    }

    public static void regex(String str) {
        System.out.println("\n" + str);
        System.out.println(str.matches(".*"));
        System.out.println(str.matches("^A[0-9]?"));
        System.out.println(str.matches("^U[A-Z]{3}"));
    } 
}
