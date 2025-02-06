import java.util.Scanner;
public class Tugas4 {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan: ");
        int n = sc.nextInt();

        System.out.println("Total pasangan pada bulan ke-" + n + " adalah:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
