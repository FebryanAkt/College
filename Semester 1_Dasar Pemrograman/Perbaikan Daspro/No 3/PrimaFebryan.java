import java.util.Scanner;
public class PrimaFebryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cekPrima = true;

        System.out.print("Masukkan bilangan: ");
        int bil = sc.nextInt();

        if (bil < 2) {
            cekPrima = false;
        } else {
            for (int i = 2; i * i <= bil; i++) {
                if (bil % i == 0) {
                    cekPrima = false;
                    break;
                }
            }
        }
        if (cekPrima) {
            System.out.println(bil + " adalah bilangan prima");
        } else {
            System.out.println(bil + " adalah bukan bilangan prima");
        }
    }
}
