import java.util.Scanner;

public class Percobaan2_1 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            System.out.print(x + "x");
            return x * hitungPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        int bilangan, pangkat;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.print("Hasil dari " + bilangan + "^" + pangkat + " adalah: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println("1 = " + hasil);
    }
}