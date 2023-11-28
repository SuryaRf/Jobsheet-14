import java.util.Scanner;

public class Tugas3_27 {
    public static boolean cekPrimaRekursif(int n, int i) {
        if (i == 1) {
            return true;
        } else {
            if (n % i == 0) {
                return false;
            } else {
                return cekPrimaRekursif(n, i - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        if (cekPrimaRekursif(n, n / 2)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }

        scanner.close();
    }
}