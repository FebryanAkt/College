import java.util.Scanner;
public class KonversiWaktuFebryan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int detik, menit, jam, sisaDetik;

        System.out.print("Masukkan detik: ");
        detik = sc.nextInt();

        jam = detik / 3600;
        sisaDetik = detik % 3600;
        menit = sisaDetik / 60;
        sisaDetik = sisaDetik % 60;

        System.out.println(jam +" jam" + " : " + menit + " menit" + " : " + sisaDetik + " detik");
    }
}