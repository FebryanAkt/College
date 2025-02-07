import java.util.Scanner;
public class AscendingFebryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, bil3, terbesar, tengah, terkecil;

        System.out.print("Masukkan bilangan pertama: ");
        bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        bil3 = sc.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                terbesar = bil1;
                tengah = bil3;
                terkecil = bil2;
            } else {
                terbesar = bil3;
                tengah = bil1;
                terkecil = bil2;
            }
        } else if (bil2 > bil3) {
            terbesar = bil2;
            if (bil1 > bil3) {
                tengah = bil1;
                terkecil = bil3;
            } else {
                tengah = bil3;
                terkecil = bil1;
            }
        } else {
            terbesar = bil3;
            tengah = bil2;
            terkecil = bil1;
        }
        System.out.println("Urutan bilangan terbesar hingga terkecil adalah: " + terbesar+ ", "+ tengah+ ", "+ terkecil);
    }    
}
