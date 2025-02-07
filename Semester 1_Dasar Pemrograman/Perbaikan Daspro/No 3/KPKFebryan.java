import java.util.Scanner;
public class KPKFebryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2;

        System.out.print("Masukkan bilangan pertama: ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = sc.nextInt();

        int kpk = 0;

        for (int i = 1; i <= bil1 * bil2; i++) {
            if (i % bil1 == 0 && i % bil2 == 0) {
                kpk = i;
                break;
            }
        }
        System.out.println("\nKPK dari "+ bil1+ " dan "+ bil2+ " adalah: "+ kpk);
    }
}
