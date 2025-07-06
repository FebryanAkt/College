import java.util.Scanner;
public class Main {
    
    public static Pasien inputPasien(Scanner sc){
        System.out.print("Nama Pasien: ");
        String nama = sc.nextLine();
        System.out.print("NIK: ");
        String nik = sc.nextLine();
        System.out.print("Keluhan: ");
        String keluhan = sc.nextLine();
        Pasien pasien = new Pasien(nama, nik, keluhan);
        return pasien;
    }
    public static Dokter inputDokter(Scanner sc){
        System.out.print("Masukkan ID Dokter: ");
        String idDokter = sc.nextLine();
        System.out.print("Masukkan Nama Dokter: ");
        String namaDokter = sc.nextLine();
        Dokter dokter = new Dokter(idDokter, namaDokter);
        return dokter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Antrian antri = new Antrian();
        Queue riwayat = new Queue(1000);
        int pilihan;
        do {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Pasien pasien = inputPasien(sc);
                    antri.tambah(pasien);
                    System.out.println(">> Pasien masuk ke dalam antrian.");
                    break;
                
                case 2:
                    if (antri.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("-- Antrian Pasien --");
                        System.out.println("Antrian Pasien:");
                        antri.print();
                    }
                    break;
                case 3:
                    pasien = antri.layaniPasien();
                    Dokter dokter = inputDokter(sc);
                    System.out.print("Masukkan durasi layanan (jam): ");
                    int durasiLayanan = sc.nextInt();
                    
                    if (riwayat.IsFull()) {
                        System.out.println("Antrian Penuh");
                    } else {
                        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
                    }
                    TransaksiLayanan transaksi = new TransaksiLayanan(pasien, dokter, durasiLayanan); //membuat objek baru data yg sudah dilayani
                    riwayat.Enqueue(transaksi);
                    break;
                case 4:
                    antri.cekSisaAntrian();
                    break;
                case 5:
                    riwayat.print();
                    break;
                case 0:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Masukkan Input yang Benar");
                    break;
            }

        } while (pilihan != 0);
    }
}
