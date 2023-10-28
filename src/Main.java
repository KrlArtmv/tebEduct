import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wproradz saldo konta: [potwirdz enterem]");
        int liscba = scanner.nextInt();

        if (liscba == 1) {
            System.out.println("Liczba to 1");
        } else if (liscba == 2) {
            System.out.println("Liczba to 2");
        } else if (liscba == 3) {
            System.out.println("Liczba to 3");
        } else {
            System.out.println("Liczba jest inna");
        }
    }
}