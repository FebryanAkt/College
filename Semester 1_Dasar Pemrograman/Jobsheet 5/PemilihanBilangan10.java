import java.util.Scanner;
public class PemilihanBilangan10 {
    public static void main (String [] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan sebuah angka: ");
    int angka = sc.nextInt();

    // if (angka % 2==0)
    // {
    //     System.out.println("Angka " + angka + " termasuk bilangan genap");
    // }
    // else
    // {
    //     System.out.println("Angka " + angka + " termasuk bilangan ganjil");
    // }

    String hasil;

    hasil = (angka % 2==0) ? "Agka " +angka+ " termasuk bilangan genap" : "Angka " +angka+ " termasuk bilangan ganjil";

    System.out.println(hasil);
    
    }
}