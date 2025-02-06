import java.util.Scanner;

public class TarifListrik10 {
    public static void main(String[] args) {
        
        //deklarasi scanner & tipe data
        Scanner sc = new Scanner(System.in);
        int jmlPenggunaanListrik;
        int totalTagihan;

        //masukkan
       
        System.out.print("Jumlah penggunaan listrik dalam kWh: ");
        jmlPenggunaanListrik = sc.nextInt();

        //total tagihan
        totalTagihan = jmlPenggunaanListrik * 1500;
        System.out.println("Total tagihan listrik anda: RP " + totalTagihan);

        boolean informasiListrikMelebihi500KWH = jmlPenggunaanListrik > 500;

        //tampilkan nilai akhir
        System.out.println("Informasi Listrik Pelanggan apakah melebihi 500 kWh: " + informasiListrikMelebihi500KWH);
    }
}
