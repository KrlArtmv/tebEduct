import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wproradz saldo konta: [potwirdz enterem]");
        double saldoKonta = scanner.nextFloat();
        double oplataZaKonto = saldoKonta * 0.1;
        System.out.printf("Saldo konta: to %s, za konto zaplacisz: %s", saldoKonta, oplataZaKonto);
    }
}