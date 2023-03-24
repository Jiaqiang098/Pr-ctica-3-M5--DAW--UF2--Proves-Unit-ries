package myutils;

import java.time.LocalDate;
import java.time.Period;

public class MyUtils {

    public static String inverteix(String cadena) {
        if (cadena == null) {
            return null;
        }
        String resultat = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultat += cadena.charAt(i);
        }
        return resultat;
    }

    public static int edat(int day, int month, int year) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);

        if (birthday.isAfter(today)) {
            return -2;
        }

        Period p = Period.between(birthday, today);
        int age = p.getYears();

        if (age > 150) {
            return -1;
        } else {
            return age;
        }
    }

    public static double factorial(double numero) {
        if (numero < 0) {
            return -1;
        }
        double resultat = 1;
        for (int i = 2; i <= numero; i++) {
            resultat *= i;
        }
        return resultat;
    }
}
