    import java.util.Scanner;
    public class Tugas1 {
        //Fungsi Rekursif
        static int faktorRekursif (int n) {
            if (n == 0) {
                System.out.println(n);
                return (n);
            } else {
                System.out.print(n+" ");
                return (faktorRekursif(n-1));
            }
        }
        //Fungsi Iteratif
        static int faktorIteratif (int n) {
            for (int i = n; i >= 0; i--) {
                System.out.print(i + " ");
            }
            return n;
        }
        //Fungsi Main
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int bil;

            System.out.print("Masukkan angka: ");
            bil = sc.nextInt();

            faktorRekursif(bil);
            faktorIteratif(bil);
        }
    }