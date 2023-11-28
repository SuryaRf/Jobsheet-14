import java.util.Scanner;

public class Tugas2_27 {
    public static int penjumlahanRekursif(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai f : ");
        int f = scanner.nextInt();

        int hasil = penjumlahanRekursif(f);

        System.out.println("Penjumlahan dari 1 sampai " + f + " adalah : " + hasil);

        scanner.close();
    }
}