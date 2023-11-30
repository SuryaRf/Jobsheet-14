import java.util.Scanner;

public class Tugas1_27 {
    public static int hitungRekursif(int n) {
        if (n == 1) {
            System.out.print("1 = ");
            return 1;
        } else {
            System.out.print(n + " + ");
            return n + hitungRekursif(n - 1);
        }
    }

    public static void hitungIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(" + ");
            }
            total += i;
        }
        System.out.print(" = " + total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();

        System.out.println("Menggunakan fungsi rekursif : ");
        int totalRekursif = hitungRekursif(n);
        System.out.println(totalRekursif);

        System.out.println("\nMenggunakan fungsi iteratif :  ");
        hitungIteratif(n);

        scanner.close();
    }
}
