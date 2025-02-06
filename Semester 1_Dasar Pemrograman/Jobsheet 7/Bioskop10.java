import java.util.Scanner;
public class Bioskop10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int harga = 50000, jmlTiket, tiketTerjual = 0, hargaTiketTerjual = 0;
        double diskon = 0, totalHarga = 0, totalBayar;
        String namaPelanggan;

        while (true) {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Masukkan jumlah tiket yang anda beli: ");
            jmlTiket = sc.nextInt();
            totalHarga = harga * jmlTiket;
            
            if (jmlTiket < 0) {
                System.out.println("Input tidak valid, masukkan input yang valid!");
                continue;
            } else if (jmlTiket > 4 && jmlTiket < 10) {
                diskon = 0.10;
            } else if (jmlTiket > 10) {
                diskon = 0.15;
            } else {

            }
            totalBayar = totalHarga - (totalHarga * diskon);
            tiketTerjual += jmlTiket;
            hargaTiketTerjual += totalBayar;
            sc.nextLine();

            System.out.println("----------------------------------");
            System.out.println("Total harga yang anda bayar: " + totalBayar);
            System.out.println("----------------------------------");
            System.out.println("Total tiket terjual dalam sehari: " + tiketTerjual);
            System.out.println("----------------------------------");
            System.out.println("Total harga tiket terjual dalam sehari:  " + hargaTiketTerjual);

        }
    }
}