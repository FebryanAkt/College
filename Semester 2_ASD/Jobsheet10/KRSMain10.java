import java.util.Scanner;
public class KRSMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRS10 antrian = new KRS10();
        int pilihan;

        do {
            System.out.println("\n========= MENU ANTRIAN KRS =========");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses 2 Mahasiswa (KRS)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Mahasiswa Terdepan");
            System.out.println("5. Tampilkan Mahasiswa Terakhir");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Cetak Jumlah Antrian");
            System.out.println("8. Cetak Jumlah yang Sudah Dilayani");
            System.out.println("9. Cetak Jumlah yang Belum Dilayani");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Jurusan : ");
                    String jurusan = sc.nextLine();
                    MahasiswaKRS10 m = new MahasiswaKRS10(nim, nama, jurusan);
                    antrian.Enqueue(m);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilAntrian();
                    break;
                case 4:
                    antrian.tampilDuaTerdepan();
                    break;
                case 5:
                    antrian.tampilPalingAkhir();
                    break;
                case 6:
                    antrian.kosongkanAntrian();
                    break;
                case 7:
                    antrian.cetakJumlahAntrian();
                    break;
                case 8:
                    antrian.cetakJumlahDilayani();
                    break;
                case 9:
                    antrian.cetakBelumDilayani();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}