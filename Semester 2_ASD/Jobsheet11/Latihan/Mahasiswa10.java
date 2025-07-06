package Latihan;

public class Mahasiswa10 {
    String nim, nama;

    Mahasiswa10(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String tampil() {
        return "NIM: " + nim + ", Nama: " + nama;
    }
}
