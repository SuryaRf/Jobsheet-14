import java.util.Scanner;
public class Tugas4_27 {

    public static void main(String[] args) {
        System.out.println("==========================================================");
        System.out.println("|  Bulan  | Produktif | Belum Produktif | Total Pasangan |");
        System.out.println("==========================================================");

        for (int i = 1; i <= 12; i++) {
            int jumlahProduktif = hitungJumlahPasanganMarmutProduktif(i);
            int jumlahBelumProduktif = hitungJumlahPasanganMarmutBelumProduktif(i);
            int jumlahTotal = jumlahProduktif + jumlahBelumProduktif;

            System.out.printf("|%-8d| %-11d| %-16d| %-14d |\n", i, jumlahProduktif, jumlahBelumProduktif, jumlahTotal);
        }

        System.out.println("==========================================================");
    }

    public static int hitungJumlahPasanganMarmutProduktif(int bulan) {
        int[] produktif = {0, 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        return produktif[bulan - 1];
    }

    public static int hitungJumlahPasanganMarmutBelumProduktif(int bulan) {
        int[] belumProduktif = {1, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        return belumProduktif[bulan - 1];
    }
}