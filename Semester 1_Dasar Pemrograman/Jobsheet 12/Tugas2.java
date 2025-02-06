import java.util.Scanner;
public class Tugas2 {
    static int i = 1;
    static int penjumlahanRekursif (int f) {
        if (i == f) {
            System.out.print(f + " = ");
            return (i);
        } else {
            System.out.print(i + " + ");
            return (i++ + penjumlahanRekursif(f));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.print("Masukkan angka = ");
        input = sc.nextInt();

        System.out.println(penjumlahanRekursif(input));
    }
}
