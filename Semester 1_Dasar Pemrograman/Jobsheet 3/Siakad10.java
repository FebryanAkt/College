import java.util.Scanner;

public class Siakad10 {
    public static void main(String[] args) {
        
        //Deklarasikan scanner dan variabel
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiAkhir, nilaiUTS, nilaiUAS;

        //Masukkan nama, NIM, kelas, absen, nilai kuis, tugas, dan ujian menggunakan scanner 
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        //Tulis perintah untuk menghitung nilai akhir
        nilaiAkhir = (nilaiKuis * 0.20 + nilaiTugas * 0.15 + nilaiUTS * 0.30 + nilaiUAS * 0.35);

        //Tampilkan data mahasiswa yang terdiri dari nama, NIM, absen, dan nilai akhir 
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

    }
}
