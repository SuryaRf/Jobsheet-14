
import java.util.Scanner;

public class kel327_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah karyawan
        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = scanner.nextInt();

        // Inisialisasi array untuk menyimpan data karyawan
        String[] namaKaryawan = new String[jumlahKaryawan];
        double[] gajiPokok = new double[jumlahKaryawan];
        double[] bonus = new double[jumlahKaryawan];

        // Input data karyawan
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("\nMasukkan data untuk Karyawan ke-" + (i + 1) + ":");
            System.out.print("Nama Karyawan: ");
            namaKaryawan[i] = scanner.next();
            System.out.print("Gaji Pokok: $");
            gajiPokok[i] = scanner.nextDouble();
            System.out.print("Bonus: $");
            bonus[i] = scanner.nextDouble();
        }

        // Hitung dan tampilkan total gaji menggunakan fungsi rekursif
        for (int i = 0; i < jumlahKaryawan; i++) {
            double totalSalary = calculateTotalSalary(gajiPokok[i], bonus[i]);
            System.out.println("\nTotal Gaji untuk " + namaKaryawan[i] + ": $" + totalSalary);
        }

        scanner.close();
    }

    // Fungsi rekursif untuk menghitung total gaji
    public static double calculateTotalSalary(double baseSalary, double bonus) {
        // Basis dari rekursi
        if (baseSalary <= 0) {
            return 0;
        }

        // Rekursi: Hitung total gaji dengan menambahkan gaji pokok dan bonus
        return baseSalary + bonus + calculateTotalSalary(baseSalary - 100, bonus);
    }
}
