import java.util.Scanner;
public class Siakad10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nama, kualifikasi, nilaiHuruf;
        int nim, nomorAbsen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        char kelas;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextInt();
        System.out.print("Masukkan kelas: ");
        kelas = sc.next().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        nomorAbsen = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) /3;
        if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        } else if (nilaiAkhir >=39 && nilaiAkhir<=50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else if (nilaiAkhir >=50 && nilaiAkhir<=60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >=60 && nilaiAkhir<=65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >=65 && nilaiAkhir<=73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >=73 && nilaiAkhir<=80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >=80 && nilaiAkhir<=100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat baik";
        } else {
            nilaiHuruf = "Invalid";
            kualifikasi = "Invalid";
        }

        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " +nim + ")" + " kelas " + kelas + " nomor absen " + nomorAbsen);
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}
