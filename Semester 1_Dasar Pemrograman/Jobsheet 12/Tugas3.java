import java.util.Scanner;
public class Tugas3 {
    static boolean cekPrima (int n, int pembagi) {
        if (n < 2) return false;
        if (pembagi == 1) return true;
        if (n % pembagi == 0) return false;
        return cekPrima(n, pembagi-1);
    } 
public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int cek;
        System.out.print("Masukkan bilangan yang akan di cek: ");
        cek = sc.nextInt();

        if (cekPrima(cek, cek-1))
        System.out.println(cek+ " merupakan bilangan prima");
        else System.out.println(cek+ " bukan bilangan prima");
    }
}