import java.util.Scanner;

public class Kel327 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama, jabatan;
        double gajiPokok;

        // Input data karyawan
        System.out.print("Nama: ");
        nama = scanner.nextLine();

        System.out.print("Jabatan: ");
        jabatan = scanner.nextLine();

        System.out.print("Gaji pokok: ");
        gajiPokok = scanner.nextDouble();

        // Hitung penghasilan bruto
        double penghasilanBruto = hitungPenghasilanBruto(gajiPokok, jabatan);

        // Hitung pajak penghasilan
        double pajakPenghasilan = hitungPajakPenghasilan(penghasilanBruto);

        // Hitung gaji bersih
        double gajiBersih = penghasilanBruto - pajakPenghasilan;

        // Tampilkan hasil perhitungan
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji pokok: " + gajiPokok);
        System.out.println("Penghasilan bruto: " + penghasilanBruto);
        System.out.println("Pajak penghasilan: " + pajakPenghasilan);
        System.out.println("Gaji bersih: " + gajiBersih);
    }

    public static double hitungPenghasilanBruto(double gajiPokok, String jabatan) {
        return gajiPokok + hitungTunjanganJabatan(jabatan);
    }

    public static double hitungTunjanganJabatan(String jabatan) {
        double gajiPokok = 2000000;
        if (jabatan.equals("Manager")) {
            return gajiPokok * 0.1;
        } else if (jabatan.equals("Supervisor")) {
            return gajiPokok * 0.05;
        } else {
            return hitungTunjanganJabatan("Manager");
        }
    }

    public static double hitungPajakPenghasilan(double penghasilanBruto) {
        if (penghasilanBruto <= 50_000_000) {
            return penghasilanBruto * 0.05;
        } else if (penghasilanBruto <= 100_000_000) {
            return penghasilanBruto * 0.1;
        } else {
            return penghasilanBruto * 0.15;
        }
    }
}
