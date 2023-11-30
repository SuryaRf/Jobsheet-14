import java.util.Scanner;

public class Investasi27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah tahun (N)
        System.out.print("Masukkan jumlah tahun (N): ");
        int n = scanner.nextInt();

        // Input jumlah uang yang diinvestasikan
        System.out.print("Masukkan jumlah uang yang diinvestasikan: ");
        double investasiAwal = scanner.nextDouble();

        // Hitung hasil investasi emas setelah N tahun menggunakan fungsi rekursif
        double hasilInvestasi = hitungInvestasiEmasRekursif(investasiAwal, n);

        // Tampilkan hasil investasi
        System.out.println("\nHasil investasi emas setelah " + n + " tahun: " + hasilInvestasi);

        scanner.close();
    }

    public static double hitungInvestasiEmasRekursif(double investasiAwal, int tahun) {
        // Basis dari rekursi
        if (tahun == 0) {
            return investasiAwal;
        }

        // Tingkat keuntungan tahunan
        double tingkatKeuntungan = 0.117; // 11,7%

        // Rekursi: Hitung hasil investasi untuk tahun sebelumnya
        double hasilInvestasiSebelumnya = hitungInvestasiEmasRekursif(investasiAwal, tahun - 1);

        // Hitung hasil investasi untuk tahun ini
        double hasilInvestasi = hasilInvestasiSebelumnya * (1 + tingkatKeuntungan);

        return hasilInvestasi;
    }
}
