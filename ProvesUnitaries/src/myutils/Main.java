package myutils;

public class Main {
    public static void main(String[] args) {
        String cadenaInvertida = MyUtils.inverteix("Hola mundo");
        System.out.println("Cadena invertida: " + cadenaInvertida);

        int edad = MyUtils.edat(1, 1, 2000);
        System.out.println("Edad: " + edad);

        double factorial = MyUtils.factorial(5);
        System.out.println("Factorial: " + factorial);
    }
}
    

