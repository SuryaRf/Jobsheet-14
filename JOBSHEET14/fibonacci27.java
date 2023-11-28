public class fibonacci27 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Deret Fibonacci sampai dengan " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
 
    // Fungsi rekursif untuk menghitung bilangan Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
