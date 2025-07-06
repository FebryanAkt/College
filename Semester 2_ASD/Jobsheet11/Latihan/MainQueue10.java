package Latihan;
import java.util.Scanner;
public class MainQueue10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QeueuMahasiswa10 antrian = new QeueuMahasiswa10();
        int pilih = -1;

        while (pilih != 0) {
            System.out.println();
            System.out.println("=== Menu Antrian Layanan Kemahasiswaan ===");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian Terdepan");
            System.out.println("4. Tampilkan Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Tampilkan Jumlah Antrian");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    Mahasiswa10 mhs = new Mahasiswa10(nim, nama);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanDepan();
                    break;
                case 4:
                    antrian.tampilkanBelakang();
                    break;
                case 5:
                    antrian.tampilkanSemua();
                    break;
                case 6:
                    antrian.tampilkanJumlah();
                    break;
                case 7:
                    antrian.cekKosong();
                    break;
                case 8:
                    antrian.kosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
        sc.close();
    }
}
