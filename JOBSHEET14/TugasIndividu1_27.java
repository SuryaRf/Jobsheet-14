import java.util.Scanner;

public class TugasIndividu1_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int n = sc.nextInt();

        // Cetak proses perhitungan untuk metode iteratif
        System.out.println("\nProses Perhitungan Iteratif:");
        for (int i = 1; i <= n; i++) {
            int result = hitungIteratif(i);
            System.out.println("Total Iteratif untuk " + i + ": " + result);
        }

        // Cetak proses perhitungan untuk metode rekursif
        System.out.println("\nProses Perhitungan Rekursif:");
        for (int i = 1; i <= n; i++) {
            int result = hitungRekursif(i);
            System.out.println("Total Rekursif untuk " + i + "     : " + result);
        }
    }

    public static int hitungIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
    
    public static int hitungRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            int result = n + hitungRekursif(n - 1);
            System.out.println("Menghitung Rekursif untuk " + n + ": " + result);
            return result;
        }
    }
}
