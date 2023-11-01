import java.util.Scanner;

public class PenjumlahanPengurangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = input.nextDouble();

        System.out.print("Masukkan operasi (+ untuk penjumlahan, - untuk pengurangan): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = input.nextDouble();

          double hasil = 0.0;
        if (operator == '+') {
            hasil = bilangan1 + bilangan2;
        } else if (operator == '-') {
            hasil = bilangan1 - bilangan2;
        } else {
            System.out.println("Operasi yang dimasukkan tidak valid.");
            System.exit(1);
        }

        System.out.println("Hasil: " + hasil);
        input.close();

    }
}
